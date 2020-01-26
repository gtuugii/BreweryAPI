package com.example.CodeAThonBreweryAPI.controller;

import com.example.CodeAThonBreweryAPI.model.*;
import com.sun.codemodel.internal.JForEach;
import org.springframework.http.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
//@CrossOrigin(origins="http://192.168.36.142:3000")
@CrossOrigin(origins = "*")
//@RequestMapping("/api/v1")
public class BeersController {

    private String url_beer = "http://api.brewerydb.com/v2/beers/?key=5865f650b89955e6f423714b51a83354";
    private String url_category = "http://api.brewerydb.com/v2/categories/?key=5865f650b89955e6f423714b51a83354";
    private BeersData beersData;
    private CategoriesData categoriesData;

    private BreweriesData breweriesData;
    private String url_brewey = "http://api.brewerydb.com/v2/breweries/?key=5865f650b89955e6f423714b51a83354";

    private BreweryBeersData breweryBeersData;

    @GetMapping("/beers")
    public BeersData getBeers() {
        if (beersData == null) {
            HttpHeaders headers = new HttpHeaders();
            HttpEntity entity = new HttpEntity<>(headers);
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<BeersData> response = restTemplate.exchange(url_beer, HttpMethod.GET, entity, BeersData.class);
            beersData = response.getBody();
            //System.out.println("response: " + r);
        }

        return beersData;
        //return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/categories")
    public CategoriesData getCategories() {
        if (categoriesData == null) {
            HttpHeaders headers = new HttpHeaders();
            HttpEntity entity = new HttpEntity<>(headers);
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<CategoriesData> response = restTemplate.exchange(url_category, HttpMethod.GET, entity, CategoriesData.class);
            categoriesData = response.getBody();
        }
        return categoriesData;
    }

    @GetMapping("/getBeersForCategory/{id}")
    public List<Beers> getBeersForCategory(@PathVariable Long id) {

        List<Beers> beers = new ArrayList<>();

        if (beersData == null) {
            getBeers();
        }

        List<Beers> allBeers = beersData.getData();

        try {

            for (Beers b : allBeers) {
                if (b.getStyle().getCategoryId() == id) {
                    beers.add(b);
                }
            }

//            beers = allBeers.stream()
//                .filter(e -> e.getStyle().getCategoryId() == id)
//                .collect(Collectors.toList());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        return beers;
    }

    @GetMapping("/breweries")
    public ResponseEntity<BreweriesData> getBreweries() {
        if (breweriesData == null) {
            HttpHeaders headers = new HttpHeaders();
            HttpEntity entity = new HttpEntity<>(headers);
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<BreweriesData> response = restTemplate.exchange(url_brewey, HttpMethod.GET, entity, BreweriesData.class);
            breweriesData = response.getBody();
        }

        return ResponseEntity.ok(breweriesData);
    }


    @GetMapping("/brewery/{breweryId}/beers")
    //@GetMapping("/brewery/beers")
    public ResponseEntity<BreweryBeersData> getBreweriesForBeer(@PathVariable String breweryId) {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();

        //http://api.brewerydb.com/v2/brewery/BznahA/beers/?key=5865f650b89955e6f423714b51a83354
        //http://api.brewerydb.com/v2/brewery/IImUD9/beers/?key=5865f650b89955e6f423714b51a83354

        String url_beerBrewery = "http://api.brewerydb.com/v2/brewery/" + breweryId + "/beers/?key=5865f650b89955e6f423714b51a83354";

        ResponseEntity<BreweryBeersData> response = restTemplate.exchange(url_beerBrewery, HttpMethod.GET, entity, BreweryBeersData.class);
        BreweryBeersData breweryBeersData = response.getBody();

        return ResponseEntity.ok(breweryBeersData);
    }

    @GetMapping("/getBeerAndCategoryList")
    public ResponseEntity<Map<String, Integer>> getBeerAndCategoryList() {

        Map<String, Integer> beerCategoriesNumber = new HashMap<>();

        if (beersData == null) {
            getBeers();
        }
        System.out.println("beersData: " + beersData.getData().size());
        for (Beers beer : beersData.getData()) {
            if (beer.getStyle() != null) {
                int catID = beer.getStyle().getCategoryId();
                String catName = beer.getStyle().getCategory().getName() + "(" + catID + ")";

                if (beerCategoriesNumber.get(catName) != null) {
                    int value = beerCategoriesNumber.get(catName);
                    beerCategoriesNumber.put(catName, ++value);
                } else {
                    beerCategoriesNumber.put(catName, 1);
                }
            }
        }

        return ResponseEntity.ok(beerCategoriesNumber);
    }
}
