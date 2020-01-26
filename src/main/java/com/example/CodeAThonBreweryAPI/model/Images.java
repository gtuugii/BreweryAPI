package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Images {
    private String icon;
    private String medium;
    private String large;
    private String squareMedium;
    private String squareLarge;
    public Images(){

    }
}
