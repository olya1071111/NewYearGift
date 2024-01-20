package com.academy.main;

import com.academy.candy.*;
import com.academy.logic.gift.GiftServiceImpl;
import com.academy.printer.Printer;

public class Main {
    public static void main(String[] args) {
       // GiftServiceImpl gift = new GiftServiceImpl();

        GiftServiceImpl giftService = new GiftServiceImpl();

        Candy bounty = new Bounty();
        Candy mars = new Mars();
        Candy snickers = new Snickers();
        Candy twix = new Twix();
        Candy nuts = new Nuts();

        giftService.addCandyWithGift(snickers);
        giftService.addCandyWithGift(bounty);
        giftService.addCandyWithGift(mars);
        giftService.addCandyWithGift(twix);
        giftService.addCandyWithGift(nuts);

        System.out.println("A New Year's gift contains:");
        Printer.printGift(giftService.getGift());

        System.out.println("Sort by name candies in the gift:");
        Printer.printGift(giftService.sortByName());

        System.out.println("Candies with a set sugar value:");
        Printer.printGift(giftService.findCandyBySugar(7,10));

        Printer.printWeight(giftService.getGiftWeight());
    }
}
