package com.example.asliceofnutritionpie;

//This NutritionFacts object contains a set of variables.



class NutritionFacts {

    // Class Variables

    private int calories;

    private int fat;

    private int sodium;

    private int carbs;

    private int sugar;

    private int protein;

    private String servingSize;



    //private int iron;

    //private int calcium;

    //private int vitaminA;

    //private int VitaminC;



    //Constructor

    NutritionFacts(int calories, int fat, int sodium, int carbs, int sugar, int protein, String servingSize){

        this.calories = calories;

        this.fat = fat;

        this.sodium = sodium;

        this.carbs = carbs;

        this.sugar = sugar;

        this.protein = protein;

        this.servingSize = servingSize;

    }



    // Getter methods

    int getCalories() {

        return calories;

    }



    int getFat() {

        return fat;

    }



    int getSodium() {

        return sodium;

    }



    int getCarbs() {

        return carbs;

    }



    int getSugar() {

        return sugar;

    }



    int getProtein() {

        return protein;

    }



    String getServingSize() {

        return servingSize;

    }



    // Setter methods

    void setCalories(int calories) {

        this.calories = calories;

    }



    void setFat(int fat) {

        this.fat = fat;

    }



    void setSodium(int sodium) {

        this.sodium = sodium;

    }



    void setCarbs(int carbs) {

        this.carbs = carbs;

    }



    void setSugar(int sugar) {

        this.sugar = sugar;

    }



    void setProtein(int protein) {

        this.protein = protein;

    }



    void setServingSize(String servingSize) {

        this.servingSize = servingSize;

    }

}