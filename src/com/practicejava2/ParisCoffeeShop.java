package com.practicejava2;

public class ParisCoffeeShop extends Coffee {


    @Override
    public void makeLatte(){
        System.out.println(" “Thanks for order Latte in ParisCoffeeShop. Bye!”");

    }

    @Override
    public void makeAmericano() {
        System.out.println(" “Thanks for order Americano in ParisCoffeeShop. Bye!”");

    }

    @Override
    public void makeTea() {
        System.out.println(" “Thanks for order Tea in ParisCoffeeShop. Bye!”");

    }
}
