package com.academy.logic.gift;

import com.academy.gift.Gift;
import com.academy.sort.SortByName;
import com.academy.candy.Candy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GiftServiceImpl implements GiftService {

    Gift gift = new Gift();

    public void addCandyWithGift(Candy candy) {
        gift.getCandy().add(candy);
    }

    @Override
    public int getGiftWeight() {
        int result = 0;
        for (Candy candy : gift.getCandy()) {
            if (gift.getCandy() != null) {
                result += candy.getWeight();
            } else {
                break;
            }
        }
        return result;
    }

    public List<Candy> sortByName() {
        Collections.sort(gift.getCandy(), new SortByName());
        return gift.getCandy();
    }

    public List<Candy> findCandyBySugar(double sugar1, double sugar2) {
        List<Candy> result = new ArrayList<>();
        for (Candy candy : gift.getCandy()) {
            if ((candy.getSugar() >= sugar1) && (candy.getSugar() <= sugar2)) {
                result.add(candy);
            } else {
                break;
            }
        }
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftServiceImpl that = (GiftServiceImpl) o;
        return Objects.equals(gift, that.gift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gift);
    }

    @Override
    public String toString() {
        return "The gift contains" + gift.getCandy() +'}';
    }

    public List<Candy> getGift() {
        return gift.getCandy();
    }
}
