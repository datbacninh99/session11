package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        System.out.println("List ban đầu là: " + listNumber);
        List<Integer> reversedList = new ArrayList<>();
        for (int i = listNumber.size() - 1; i >= 0; i--) {
            reversedList.add(listNumber.get(i));
        }
        System.out.println("List đảo ngược là: " + reversedList);

//        Collections.sort(listNumber, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        Collections.sort(listNumber); // Sắp xếp tăng dần
        Collections.reverse(listNumber); // Đảo ngược
        System.out.println("List sắp xếp giảm dần là: " + listNumber);
    }
}