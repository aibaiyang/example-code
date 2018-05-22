package com.example.demo.collections;

import gnu.trove.list.array.TIntArrayList;

public class TroveConllections {

    public static void main(String[] args) {

        TIntArrayList intList = new TIntArrayList();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.reverse();
        System.out.println(intList);
    }
}
