package com.practicejava2;

public class NewYorkCoffeeShop extends Coffee {


    @Override
    public void makeLatte(){
        System.out.println(" “Thanks for order Latte in NewYorkCoffeeShop. Bye!”");

    }

    @Override
    public void makeAmericano() {
        System.out.println(" “Thanks for order Americano in NewYorkCoffeeShop. Bye!”");

    }

    @Override
    public void makeTea() {
        System.out.println(" “Thanks for order Tea in NewYorkCoffeeShop. Bye!”");

    }
}
