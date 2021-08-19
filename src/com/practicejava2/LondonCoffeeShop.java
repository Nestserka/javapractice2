package com.practicejava2;

public class LondonCoffeeShop extends Coffee implements Biscuits {

    @Override
    public void makeLatte(){
        System.out.println(" “Thanks for order Latte in LondonCoffeeShop. Bye!”");

    }

    @Override
    public void makeAmericano() {
        System.out.println(" “Thanks for order Americano in LondonCoffeeShop. Bye!”");

    }

    @Override
    public void makeTea() {
        System.out.println(" “Thanks for order Tea in LondonCoffeeShop. Bye!”");

    }

    @Override
    public void sellBiscuits() {
        System.out.println(" “Take your cookie”");
    }
}