package com.example.asliceofnutritionpie;




class Item {



    private String foodName;

    private int foodCalories;

    private String foodServingSize;

    private int foodImage;



    Item(String foodName, int foodCalories, String foodServingSize, int foodImage)

    {

        this.foodName = foodName;

        this.foodCalories = foodCalories;

        this.foodServingSize = foodServingSize;

        this.foodImage = foodImage;

    }



    // Getter methods

    public String getFoodName()

    {

        return foodName;

    }



    public int getFoodCalories()

    {

        return foodCalories;

    }



    public String getFoodServingSize()

    {

        return foodServingSize;

    }



    public int getFoodImage()

    {

        return foodImage;

    }



    // Setter Methods

    void setFoodName(String calories) {

        this.foodName = foodName;

    }



    void setFoodCalories(int foodCalories) {

        this.foodCalories = foodCalories;

    }



    void setFoodServingSize(String foodServingSize) {

        this.foodServingSize = foodServingSize;

    }



    void setFoodImage(int foodImage) {

        this.foodImage = foodImage;

    }

}
