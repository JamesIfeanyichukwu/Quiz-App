package com.gteckkdevelopers.restaurant.model;

import com.gteckkdevelopers.restaurant.R;

import java.util.ArrayList;

/**
 * Created by Ifeanyichuku on 5/22/2018.
 */

public class ItemList {

    public static ArrayList<Model> getList(){

        ArrayList<Model> restaurantList = new ArrayList<>();
        restaurantList.add(new Model(R.drawable.res1), "Chitis Restaurant:", "This is Chitis Restaurant");
        restaurantList.add(new Model(R.drawable.res1), "Chitis Restaurant:", "This is Chitis Restaurant");
    }
}
