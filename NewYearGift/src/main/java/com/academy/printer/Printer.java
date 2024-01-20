package com.academy.printer;

import com.academy.candy.Candy;
import java.util.List;

public class Printer {
    public static void printGift(List<Candy> candies) {
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        for (Candy candy : candies) {
            str.append(candy.getName());
            str.append(" ");
        }
        str.append("]\n");
        System.out.println(str.toString());
    }
    public static void printWeight(int price){
        System.out.println("The Weight a gift is - " + price + "gr");
    }
}
