package fr.diginamic.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FusionList {
    public static void main(String[] args) {
        // First List
        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Orange");

        // Second List
        List<String> list2 = new ArrayList<>();
        list2.add("White");
        list2.add("Blue");
        list2.add("Orange");

        List<String> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        System.out.println(list3);
    }
}
