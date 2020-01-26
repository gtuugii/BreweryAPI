package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Labels {
    private String icon;
    private String medium;
    private String large;
    private String contentAwareIcon;
    private String contentAwareMedium;
    private String contentAwareLarge;

    public Labels(){

    }

}
