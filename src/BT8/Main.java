package BT8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber1 = new ArrayList<>();
        listNumber1.add(1);
        listNumber1.add(2);
        listNumber1.add(3);

        List<Integer> listNumber2 = new ArrayList<>();
        listNumber2.add(4);
        listNumber2.add(5);
        listNumber2.add(6);

        listNumber1.addAll(listNumber2);
        System.out.println("Danh sách 1: ");
        System.out.println(listNumber1);
        System.out.println("Danh sách 2: ");
        System.out.println(listNumber2);
    }
}
