package com.gteckkdevelopers.restaurant.model;

/**
 *
 * Created by Ifeanyichuku on 5/22/2018.
 */

public class Model {

    private int restImage;
    private String resaurantTitle;
    private String restaurantDet;

    public Model(int restImage, String resaurantTitle, String restaurantDet) {
        this.restImage = restImage;
        this.resaurantTitle = resaurantTitle;
        this.restaurantDet = restaurantDet;
    }

    public int getRestImage() {
        return restImage;
    }

    public void setRestImage(int restImage) {
        this.restImage = restImage;
    }

    public String getResaurantTitle() {
        return resaurantTitle;
    }

    public void setResaurantTitle(String resaurantTitle) {
        this.resaurantTitle = resaurantTitle;
    }

    public String getRestaurantDet() {
        return restaurantDet;
    }

    public void setRestaurantDet(String restaurantDet) {
        this.restaurantDet = restaurantDet;
    }
}
