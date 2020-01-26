package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoriesData {

    private String message;

    private List<Category> data;

    public CategoriesData() {
    }
}
