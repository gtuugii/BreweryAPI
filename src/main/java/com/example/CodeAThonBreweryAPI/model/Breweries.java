package com.example.CodeAThonBreweryAPI.model;

/*
id: "BznahA",
name: "Anheuser-Busch InBev",
nameShortDisplay: "Anheuser-Busch InBev",
description: "Anheuser-Busch operates 12 breweries in the United States, 14 in China and one in the United Kingdom. Anheuser-Busch's operations and resources are focused on adding to life's enjoyment not only through the responsible consumption of beer by adults, but through theme park entertainment and packaging. In the United States, the company holds a 48.5 percent share of U.S. beer sales. Worldwide, Anheuser-Busch's beer sales volume was 128.4 million barrels in 2007. The St. Louis-based company's subsidiaries include one of the largest U.S. manufacturers of aluminum beverage containers and one of the world's largest recyclers of aluminum beverage cans. Anheuser-Busch also has interests in malt production, rice milling, real estate development, turf farming, metalized and paper label printing, bottle production and transportation services.",
website: "http://www.anheuser-busch.com/",
established: "1852",
isOrganic: "N",
images: {
icon: "https://brewerydb-images.s3.amazonaws.com/brewery/BznahA/upload_0FkKKl-icon.png",
medium: "https://brewerydb-images.s3.amazonaws.com/brewery/BznahA/upload_0FkKKl-medium.png",
large: "https://brewerydb-images.s3.amazonaws.com/brewery/BznahA/upload_0FkKKl-large.png",
squareMedium: "https://brewerydb-images.s3.amazonaws.com/brewery/BznahA/upload_0FkKKl-squareMedium.png",
squareLarge: "https://brewerydb-images.s3.amazonaws.com/brewery/BznahA/upload_0FkKKl-squareLarge.png"
},
status: "verified",
statusDisplay: "Verified",
createDate: "2012-01-03 02:41:44",
updateDate: "2018-11-02 02:15:01",
isMassOwned: "Y",
isInBusiness: "Y",
isVerified: "N"
*
* */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Breweries {

    private String id;
    private String name;
    private String nameShortDisplay;
    private String description;
    private String website;
    private int established;
    private boolean isOrganic;

    private String mailingListUrl;

    private Images images;

    private String status;
    private String statusDisplay;
    private String createDate;
    private String updateDate;

    private boolean isMassOwned;
    private boolean isInBusiness;
    private boolean isVerified;

    public Breweries(){

    }

}
