package com.practicejava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    private final static String HELLO_ORIGIN = "What city are you from?";
    private final static List<String> CITIES = List.of("1. London", "2. Seoul", "3. California ",
            "4. Paris", "5. New York ");
    private final static String ORDER_QUESTION = "What do you want to order?";
    private final static List<String> ORDER_TYPE = List.of("1. Latte", "2. Americano", "3. Tea");
    private final static String COOKIE_QUESTION = "Maybe you want some cookie too?";
    private final static List<String> COOKIE_REPLY = List.of("1. Yes", "2. No");

    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Coffee coffee;
        Biscuits biscuits;
        System.out.println(HELLO_ORIGIN);
//        for (String city: CITIES) {
//            System.out.println(city); //for, for each}
        CITIES.forEach(System.out::println);
        int userIn = Integer.parseInt(bf.readLine());
        if (userIn == 1) {
            coffee = new LondonCoffeeShop();
            biscuits = new LondonCoffeeShop();
            cookieChoice(bf, biscuits);
            orderChoice(bf, coffee);
        } else if (userIn == 2) {
            coffee = new SeoulCoffeeShop();
            orderChoice(bf, coffee);
        } else if (userIn == 3) {
            coffee = new CaliforniaCoffeeShop();
          biscuits = new  CaliforniaCoffeeShop();
            cookieChoice(bf, biscuits);
            orderChoice(bf, coffee);
        } else if (userIn == 4) {
            coffee = new ParisCoffeeShop();
            orderChoice(bf, coffee);
        } else if (userIn == 5) {
            coffee = new NewYorkCoffeeShop();
            orderChoice(bf, coffee);

        }
        bf.close();
    }
    private static void cookieChoice(BufferedReader bf,  Biscuits biscuits) throws  IOException {
        System.out.println(COOKIE_QUESTION);
        COOKIE_REPLY.forEach(System.out::println);
        int cookieChoice = Integer.parseInt(bf.readLine());
        if (cookieChoice == 1)
            biscuits.sellBiscuits();
    }

    private static void orderChoice(BufferedReader bf, Coffee coffee) throws InterruptedException, IOException {
        System.out.println(ORDER_QUESTION);
        ORDER_TYPE.forEach(System.out::println);
        int orderChoice = Integer.parseInt(bf.readLine());
        coffee.waitCoffee();
        Thread.sleep(3000);
        if (orderChoice == 1) {
            coffee.makeLatte();
        }
        else if (orderChoice == 2) {
            coffee.makeAmericano();
        }
        else if (orderChoice == 3) {
            coffee.makeTea();
        }
    }
}