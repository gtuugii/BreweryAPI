package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BreweriesData {
    private int currentPage;
    private int numberOfPages;
    private int totalResults;
    private List<Breweries> data;

    public BreweriesData(){

    }
}
