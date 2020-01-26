package com.example.CodeAThonBreweryAPI.model;

/*
id: "c4f2KE",
name: "'Murican Pilsner",
nameDisplay: "'Murican Pilsner",
abv: "5.5",
glasswareId: 4,
styleId: 98,
isOrganic: "N",
isRetired: "N",
* */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Beers {

    private String id;
    private String name;
    private String nameDisplay;
    private String abv;
    private int glasswareId;
    private int styleId;
    private boolean isOrganic;
    private boolean isRetired;

    private Labels labels;

    private String status;
    private String statusDisplay;
    private String createDate;

    private String updateDate;

    private Glass glass;

    private Style style;

    public Beers(){

    }
}
