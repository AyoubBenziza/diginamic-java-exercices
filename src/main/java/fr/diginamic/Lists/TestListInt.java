package fr.diginamic.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class TestListInt {
    public static void main(String[] args) {
        System.out.println("------ TestListInt ------");
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println("List: " + list);
        System.out.println("List size: " + list.size());
        System.out.println("Max: " + Collections.max(list));
        list.remove(Collections.min(list));
        System.out.println("List: " + list);

        //Iterator
        System.out.println("--- Iterator ---");
        for (int next : list) {
            if (next < 0) {
                list.set(list.indexOf(next), Math.abs(next));
            }
        }
        System.out.println("List: " + list);
        System.out.println("--- Iterator ---");
        System.out.println("------ TestListInt ------");
    }
}
