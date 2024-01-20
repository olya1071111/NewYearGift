package com.academy.gift;

import com.academy.candy.Candy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gift {
    List<Candy> candies = new ArrayList<Candy>();

    public Gift() {
    }

    public Gift(List<Candy> candies) {
        this.candies = candies;
    }

    public List<Candy> getCandy() {
        return this.candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(candies, gift.candies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candies);
    }

    @Override
    public String toString() {
        return "Gift{" +
                "candies=" + candies +
                '}';
    }
}
