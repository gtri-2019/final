package com.example.asliceofnutritionpie;


//This Food object contains a unique identifier, nutrition facts, and searchable tags.



import java.util.List;

import java.util.UUID;



class Food {

    // Class variables

    private String uuid;

    private String name;

    private NutritionFacts nutritionFacts;

    private List<String> tags;

    private int image;



    // Constructor

    Food(String name, NutritionFacts nutritionFacts, List<String> tags, int image) {

        this.uuid = UUID.randomUUID().toString();

        this.name = name;

        this.nutritionFacts = nutritionFacts;

        this.tags = tags;

        this.image = image;

    }



    // Getter methods

    String getUUID() {

        return uuid;

    }



    String getName() {

        return name;

    }



    NutritionFacts getNutritionFacts() {

        return nutritionFacts;

    }



    List<String> getTags() {

        return tags;

    }



    int getImage() {

        return image;

    }



    // Setter methods

    void setUUID(String uuid) {

        this.uuid = uuid;

    }



    void setName(String name) {

        this.name = name;

    }



    void setNutritionFacts(NutritionFacts nutritionFacts) {

        this.nutritionFacts = nutritionFacts;

    }



    void setTags(List<String> tags) {

        this.tags = tags;

    }



    void setImage(int image) {

        this.image = image;

    }

}