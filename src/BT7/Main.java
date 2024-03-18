package BT7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }
        System.out.println(listNumber);
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        List<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) % 2 != 0) {
                listNumber.add(listNumber.get(i));
            }
        }
        System.out.println(listNum);
    }
}
