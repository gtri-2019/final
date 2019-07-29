package com.example.asliceofnutritionpie;
//This Meal object contains a unique identifier, total nutrition facts, and a timestamp.



import java.util.UUID;

import java.sql.Timestamp;



class Meal {

    // Class variables

    private String uuid;

    private String name;

    private NutritionFacts totalNutritionFacts;

    private String timestamp;



    // Constructor

    Meal(String uuid, String name, NutritionFacts totalNutritionFacts, String timestamp) {

        this.uuid = UUID.randomUUID().toString();

        this.name = name;

        this.totalNutritionFacts = totalNutritionFacts;

        this.timestamp = new Timestamp(System.currentTimeMillis()).toString();

    }



    // Getter methods

    String getUUID() {

        return uuid;

    }



    String getName() {

        return name;

    }



    NutritionFacts getNutritionFacts() {

        return totalNutritionFacts;

    }



    String getTimestamp() {

        return timestamp;

    }



    // Setter methods

    void setUUID(String uuid) {

        this.uuid = uuid;

    }



    void setName(String name) {

        this.name = name;

    }



    void setNutritionFacts(NutritionFacts totalNutritionFacts) {

        this.totalNutritionFacts = totalNutritionFacts;

    }



    void setTimestamp(String timestamp) {

        this.timestamp = timestamp;

    }

}