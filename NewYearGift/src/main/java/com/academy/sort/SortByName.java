package com.academy.sort;

import com.academy.candy.Candy;

import java.util.Comparator;

public class SortByName implements Comparator<Candy> {
    public int compare(Candy o1, Candy o2){
        return o1.getName().compareTo(o2.getName());
    }

}

