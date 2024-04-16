package com.neto.appboradezero.model;

public class Drinks {
    int imgBeer;
    String drinkName;
    String drinkDescription;
    String price;

    public Drinks(int imgBeer, String drinkName, String drinkDescription, String price) {
        this.imgBeer = imgBeer;
        this.drinkName = drinkName;
        this.drinkDescription = drinkDescription;
        this.price = price;
    }

    public int getImgBeer() {
        return imgBeer;
    }

    public void setImgBeer(int imgBeer) {
        this.imgBeer = imgBeer;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
