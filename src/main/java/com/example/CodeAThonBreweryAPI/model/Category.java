package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String createDate;

    public Category(){

    }
}
