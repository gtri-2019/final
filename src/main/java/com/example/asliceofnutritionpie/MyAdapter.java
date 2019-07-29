package com.example.asliceofnutritionpie;


import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;

import android.widget.ImageView;

import android.widget.TextView;



import java.util.ArrayList;



class MyAdapter extends ArrayAdapter<Item> {



    ArrayList<Item> foodList;



    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {

        super(context, textViewResourceId, objects);

        foodList = objects;

    }



    @Override

    public int getCount() {

        return super.getCount();

    }



    @Override

    public View getView(int position, View convertView, ViewGroup parent) {



        View v = convertView;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = inflater.inflate(R.layout.food_list_view_layout, null);

        TextView textView = (TextView) v.findViewById(R.id.foodNameText);

        ImageView imageView = (ImageView) v.findViewById(R.id.foodIcon);

        textView.setText(foodList.get(position).getFoodName());

        imageView.setImageResource(foodList.get(position).getFoodImage());

        return v;



    }



}