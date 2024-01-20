package com.academy.logic.gift;

import com.academy.candy.Candy;

import java.util.List;

public interface GiftService {
    void addCandyWithGift(Candy candy);

    int getGiftWeight();

    public List<Candy> sortByName();

    public List<Candy> findCandyBySugar(double sugar1, double sugar2);
}
