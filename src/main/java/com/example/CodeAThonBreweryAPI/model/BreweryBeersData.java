package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BreweryBeersData {
    private String message;
    private List<Beers> data;

    public BreweryBeersData(){

    }
}
