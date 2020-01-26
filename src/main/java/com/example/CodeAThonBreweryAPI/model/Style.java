package com.example.CodeAThonBreweryAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Style {
    private Long id;
    private int categoryId;
    private Category category;
    private String name;
    private String shortName;
    private String description;
    private String ibuMin;
    private String ibuMax;
    private String abvMin;
    private String abvMax;
    private String srmMin;
    private String srmMax;
    private String ogMin; //: "1.045",
    private String fgMin; //
    private String fgMax; //: "1.018",
    private String createDate;
    private String updateDate;

    public Style(){

    }
}
