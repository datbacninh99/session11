package BT6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random() * 100));
        }
        System.out.println(listNumber);

        for (int i = 0; i < listNumber.size(); i++) {
            for (int j = 0; j < listNumber.size() - 1; j++) {
                if (listNumber.get(j) > listNumber.get(j + 1)) {
                    int key = listNumber.get(j);
                    listNumber.set(j, listNumber.get(j + 1));
                    listNumber.set(j + 1, key);
                }
            }
        }
        System.out.println(listNumber);
    }
}
