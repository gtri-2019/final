package com.example.asliceofnutritionpie;

//This FoodRepository object contains a hash map of food items



import java.util.Arrays;

import java.util.HashMap;

import java.util.List;

import java.util.Map;



class FoodRepository {



    // Create a hash map

    private Map<String, Food> foods = new HashMap<>();



    // Constructor

    FoodRepository() {



        //Food Objects

        NutritionFacts cokeNutritionFacts = new NutritionFacts(190, 0, 60, 54, 54, 0, "One Can");

        List<String> cokeTags = Arrays.asList("Drink", "Cola", "Coca-Cola", "Coke", "Dinner", "Lunch", "Fast Food");

        Food coke = new Food("Coca-Cola", cokeNutritionFacts, cokeTags, R.drawable.burgericon);

        foods.put(coke.getUUID(), coke);



        NutritionFacts drpepperNutritionFacts = new NutritionFacts(180, 0, 75, 48, 47, 0, "One Can");

        List<String> drpepperTags = Arrays.asList("Drink", "Cola", "Dr Pepper", "Dinner", "Lunch", "Fast Food");

        Food drpepper = new Food( "Dr Pepper", drpepperNutritionFacts, drpepperTags, R.drawable.burgericon);

        foods.put(drpepper.getUUID(), drpepper);



        NutritionFacts cfaSandwichNutritionFacts = new NutritionFacts(440, 19, 1350, 40, 5, 28, "One Sandwich");

        List<String> cfaSandwichTags = Arrays.asList("Entree", "Sandwich", "Dinner", "Lunch", "Chick Fil A", "Chicken", "Fast Food");

        Food cfaSandwich = new Food( "Chick Fil A Chicken Sandwich", cfaSandwichNutritionFacts, cfaSandwichTags, R.drawable.burgericon);

        foods.put(cfaSandwich.getUUID(), cfaSandwich);



        NutritionFacts bigMacNutritionFacts = new NutritionFacts(540, 28, 940, 42, 9, 25, "One Burger");

        List<String> bigMacTags = Arrays.asList("Entree", "Burger", "Dinner", "Lunch", "McDonalds", "Beef", "Fast Food");

        Food bigMac = new Food( "McDonalds Big Mac", bigMacNutritionFacts, bigMacTags, R.drawable.burgericon);

        foods.put(bigMac.getUUID(), bigMac);



        NutritionFacts waffleNutritionFacts = new NutritionFacts(590, 29, 740, 69, 17, 11, "One Waffle");

        List<String> waffleTags = Arrays.asList("Entree", "Waffle", "Dinner", "Lunch", "Breakfast", "IHOP");

        Food waffle = new Food( "IHOP Belgian Waffle", waffleNutritionFacts, waffleTags, R.drawable.burgericon);

        foods.put(waffle.getUUID(), waffle);



        NutritionFacts laysClassicNutritionFacts = new NutritionFacts(160, 10, 170, 15, 0, 2, "One Bag");

        List<String> laysClassicTags = Arrays.asList("Side", "Chips", "Dinner", "Lunch", "Snack", "Lay's", "Potato Chips");

        Food laysClassic = new Food( "Lay's Classic Potato Chips", laysClassicNutritionFacts, laysClassicTags, R.drawable.burgericon);

        foods.put(laysClassic.getUUID(), laysClassic);



        NutritionFacts pjPizzaNutritionFacts = new NutritionFacts(220, 9, 570, 27, 3, 8, "One Slice");

        List<String> pjPizzaTags = Arrays.asList("Entree", "Italian", "Dinner", "Lunch", "Papa John's", "Pepperoni Pizza", "Fast Food", "Pepperoni");

        Food pjPizza = new Food( "Papa John's Medium Pepperoni Pizza (One Slice)", pjPizzaNutritionFacts, pjPizzaTags, R.drawable.burgericon);

        foods.put(pjPizza.getUUID(), pjPizza);



        NutritionFacts spaghettiMeatballsNutritionFacts = new NutritionFacts(1460, 105, 3320, 110, 10, 73, "One Dish");

        List<String> spaghettiMeatballsTags = Arrays.asList("Entree", "Italian", "Dinner", "Lunch", "Spaghetti", "Meatballs", "Pasta");

        Food spaghettiMeatballs = new Food( "Macaroni Grill Spaghetti and Meatballs", spaghettiMeatballsNutritionFacts, spaghettiMeatballsTags, R.drawable.burgericon);

        foods.put(spaghettiMeatballs.getUUID(), spaghettiMeatballs);



        NutritionFacts mdFrenchFriesNutritionFacts = new NutritionFacts(230, 11, 160, 29, 0, 3, "One Fry");

        List<String> mdFrenchFriesTags = Arrays.asList("Side", "Fries", "Dinner", "Lunch", "Snack", "McDonalds", "French Fries", "Potato", "Fast Food");

        Food mdFrenchFries = new Food( "Small McDonalds French Fries", mdFrenchFriesNutritionFacts, mdFrenchFriesTags, R.drawable.burgericon);

        foods.put(mdFrenchFries.getUUID(), mdFrenchFries);



        NutritionFacts peOrangeChickenNutritionFacts = new NutritionFacts(490, 23, 820, 51, 19, 25, "One Dish");

        List<String> peOrangeChickenTags = Arrays.asList("Entree", "Orange Chicken", "Asian", "Fast Food", "Dinner", "Lunch", "Panda Express");

        Food peOrangeChicken = new Food( "Panda Express Orange Chicken", peOrangeChickenNutritionFacts, peOrangeChickenTags, R.drawable.burgericon);

        foods.put(peOrangeChicken.getUUID(), peOrangeChicken);

    }



    // Getter methods

    Map<String, Food> getFoods() {

        return foods;

    }



    // Setter methods

    void setFoods(Map<String, Food> foods) {

        this.foods = foods;

    }

}