package com.example.asliceofnutritionpie;
// This FoodGroup object contains a unique identifier and a timestamp.



import java.util.UUID;



class FoodGroup {



    // Class variables

    private String uuid;

    private String name;

    private NutritionFacts nutritionFacts;

    private String tag;



    // Constructor

    FoodGroup(String uuid, String name, NutritionFacts nutritionFacts, String tag) {

        this.uuid = UUID.randomUUID().toString();

        this.name = name;

        this.nutritionFacts = nutritionFacts;

        this.tag = tag;

    }



    // Getter methods

    String getUUID() {

        return uuid;

    }



    String getName() {

        return name;

    }



    String getTag() {

        return tag;

    }



    // Setter methods

    void setName(String name) {

        this.name = name;

    }



    void setUUID(String uuid) {

        this.uuid = uuid;

    }



    void setTag(String tag) {

        this.tag = tag;

    }

}