package com.practicejava2;

public class CaliforniaCoffeeShop extends Coffee implements Biscuits {


    @Override
    public void makeLatte(){
    System.out.println(" “Thanks for order Latte in CaliforniaCoffeeShop. Bye!”");

    }

    @Override
    public void makeAmericano() {
        System.out.println(" “Thanks for order Americano in CaliforniaCoffeeShop. Bye!”");

    }

    @Override
    public void makeTea() {
        System.out.println(" “Thanks for order Tea in CaliforniaCoffeeShop. Bye!”");

    }


    @Override
    public void sellBiscuits() {
        System.out.println(" “Take your cookie”");
    }
}
