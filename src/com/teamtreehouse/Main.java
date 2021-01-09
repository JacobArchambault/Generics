package com.teamtreehouse;

public class Main {

    public static void main(String[] args) {

        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        debugAdd(new Milk(), boxOfMilk);
        debugAdd(new Oranges(), boxOfOranges);

        ((Milk)boxOfMilk.remove()).drink();
        ((Oranges)boxOfOranges.remove()).juggle();
    }

    static <T> void debugAdd(T item, Box<T> box) {
        System.out.println("Type: " + item.getClass().getSimpleName());
        box.add(item);
    }
}
