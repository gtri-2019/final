package com.example.asliceofnutritionpie;


//This Food object contains a unique identifier, nutrition facts, and searchable tags.



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import java.util.ArrayList;
import java.util.Map;

public class search_page extends AppCompatActivity {


    private ArrayList<Food> matchingList;
    private ArrayList<String> namesList;
    private ArrayList caloriesList;
    String searchValue;

    // Constructor
    search_page( ArrayList<Food> matchingList, ArrayList<String> namesList, ArrayList caloriesList) {



        this.matchingList = matchingList;
        this.namesList = namesList;
        this.caloriesList = caloriesList;



        FoodRepository items = new FoodRepository();

        Map<String, Food> foods = items.getFoods();



        //something to set value from user input

    }


    // Getter methods
    ArrayList<Food> getMatchingList() {
        return matchingList; }
    ArrayList<String> getNamesList() {
        return namesList; }
    ArrayList getCaloriesList() {
        return caloriesList; }

    // Setter methods

    void setMatchingList(ArrayList<Food> matchingList) {
        this.matchingList = matchingList; }
    void setNamesList(ArrayList<String> namesList) {
        this.namesList = namesList; }
    void setCalorieList(ArrayList caloriesList) {
        this.caloriesList = caloriesList; }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);

    }


    public void searchFoods (View view) {

        AutoCompleteTextView foodEditText = findViewById(R.id.foodNameEditTextView);
        FoodRepository items = new FoodRepository();
        ListView foodListView = findViewById(R.id.foodListView);
        Map<String, Food> foods = items.getFoods();
        ArrayList foodArray = new ArrayList();



        String searchValue = foodEditText.getText().toString();


        for(Map.Entry<String, Food> entry : foods.entrySet()) {

            Food v = entry.getValue();

            if(v.getTags().contains(searchValue)) {

                matchingList.add(v);

                namesList.add(v.getName());

                caloriesList.add(v.getNutritionFacts().getCalories());
            }

        }
        foodArray.add(foods);

        String[] from = {"namesList","caloriesList","matchingList"};
        int[] to = {R.id.foodNameText,R.id.foodDescriptionText,R.id.foodIcon};
        SimpleAdapter foodListAdapter = new SimpleAdapter(this,foodArray,R.layout.food_list_view_layout,from,to);



/*

        caloriesConsumed = (caloriesConsumed + display.getNutritionFacts().getCalories());

        fatConsumed = (fatConsumed + display.getNutritionFacts().getFat());

        sodiumConsumed = (sodiumConsumed + display.getNutritionFacts().getSodium());

        carbsConsumed = (carbsConsumed + display.getNutritionFacts().getCarbs());

        sugarConsumed = (sugarConsumed + display.getNutritionFacts().getSugar());

        proteinConsumed = (proteinConsumed + display.getNutritionFacts().getProtein());

*/



    }


}

