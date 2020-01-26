package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BeersData {
    private int currentPage;
    private int numberOfPages;
    private int totalResults;
    private List<Beers> data;

    public BeersData(){

    }
}
