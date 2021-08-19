package com.practicejava2;

public class SeoulCoffeeShop extends Coffee {


    @Override
    public void makeLatte() {
        System.out.println(" “Thanks for order Latte in SeoulCoffeeShop. Bye!”");

    }

    @Override
    public void makeAmericano() {
        System.out.println(" “Thanks for order Americano in SeoulCoffeeShop. Bye!”");

    }

    @Override
    public void makeTea() {
        System.out.println(" “Thanks for order Tea in SeoulCoffeeShop. Bye!”");

    }
}