package BT9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(4);
        listNumber.add(5);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < listNumber.size(); i++) {
            // Nếu phần tử không tồn tại trong newList thì add vào list mới
            if (!newList.contains(listNumber.get(i))) {
                newList.add(listNumber.get(i));
            }
        }
        System.out.println(newList);

//        for (int i = 0; i < listNumber.size(); i++) {
//            // Duyệt mảng
//            // Nếu phần tử i = phần tử j thì xóa
//            for (int j = i + 1; j < listNumber.size(); j++)
//                if (Objects.equals(listNumber.get(j), listNumber.get(i))) {
//                    listNumber.remove(j);
//                    j--; // Giảm 1 sau khi xóa
//                }
//        }
//        System.out.println(listNumber);
    }
}
