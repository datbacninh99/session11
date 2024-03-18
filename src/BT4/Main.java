package BT4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";

        List<String> stringlist = new ArrayList<>();

        // Cắt chuỗi thành các phần tử trong mảng tại vị trí có dấu "\\s"
        String[] arrString = str.split("\\s");

        System.out.println(Arrays.toString(arrString));

        // Cách 1: Dùng addAll chuyển các phần tử trong mảng sang danh sách
        Collections.addAll(stringlist, arrString);

        // Cách 2: Duyệt từng phần tử trong mảng add vào danh sách
//        for (String word : arrString) {
//            stringlist.add(word.trim());
//        }

        System.out.println("Danh sách những phần tử có độ dài lớn hơn 3 là: ");
        for (String word : stringlist) {
            if (word.length() > 3 ) {
                System.out.println(word);
            }
        }
    }
}