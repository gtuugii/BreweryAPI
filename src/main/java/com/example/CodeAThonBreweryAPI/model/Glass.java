package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Glass {

    private Long id;
    private String name;
    private String createDate; // "2012-01-03 02:41:33"

    public Glass(){

    }

}
