package fr.diginamic.Lists;

import java.util.ArrayList;

public class CreateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        add100Numbers(list);
        System.out.println("List size: " + list.size());
    }

    public static void add100Numbers(ArrayList<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }
}
