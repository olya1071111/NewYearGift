package com.academy.candy;

import java.util.Objects;

public abstract class Candy {
    private String name;
    private double price;
    private int weight;
    private double sugar;

    public Candy(String name, double price, int weight, double sugar) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return Double.compare(candy.price, price) == 0 && weight == candy.weight && Double.compare(candy.sugar, sugar) == 0 && Objects.equals(name, candy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight, sugar);
    }
}
