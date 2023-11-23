package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {
    private final List<Integer> basketList = new ArrayList<>();

    public List<Integer> addStore(Integer items) {
        basketList.add(items);
        return basketList;
    }

    public Collection<Integer> get() {
        return new ArrayList<>(basketList);
    }
}
