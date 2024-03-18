package BT14;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1; // Tạo kích thước ngẫu nhiên từ 1 đến 10
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(); // Tạo ma trận vuông

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(); // Tạo hàng mới
            for (int j = 0; j < n; j++) {
                row.add(rand.nextInt(101)); // Thêm phần tử ngẫu nhiên từ 0 đến 100 vào hàng
            }
            matrix.add(row); // Thêm hàng vào ma trận
        }

        // In ma trận
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}