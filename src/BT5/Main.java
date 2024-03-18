package BT5;

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
        for (String word : arrString) {
            stringlist.add(word.trim());
        }

        System.out.println("Danh sách những phần tử có độ dài lớn hơn 3 là: ");
        for (String word : stringlist) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }

        // Gán min = độ dài của phần tử đầu tiên
        int min = stringlist.get(0).length();
        // In ra danh sách
        System.out.println(stringlist);
        // Tạo danh sách mới chứa các phần tử có độ dài min
        List<String> listMin = new ArrayList<>();
        // Duyệt kiểm tra danh sách chứa các phần tử
        for (String word : stringlist) {
            // Nếu độ dài của phân tử nhỏ hơn min thì gắn lại min & add mới vào danh sách những phần tử có độ dài min đã lưu
            if (word.length() < min) {
                listMin.clear();
                listMin.add(word);
                min = word.length();
                // Nếu độ dài phần tử = min thì chỉ add vào danh sách lưu trữ min
            } else if (word.length() == min) {
                listMin.add(word);
            }
            // In ra danh sách các phần tử có độ dài min vừa kiểm tra
            System.out.println("Danh sách phần tử ngắn nhất là: ");
            System.out.println(listMin);
        }
    }
}