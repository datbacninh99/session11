package BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int)(Math.random() * 100));
        }
        for (Integer i : listNumber) {
            System.out.println(i + "");
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + Collections.max(listNumber));
    }
}