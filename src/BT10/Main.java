package BT10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int)(Math.random() * 10));
        }
        System.out.println("Dãy số ngẫu nhiên 10 số: " + numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị 1: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị 2: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (number1 <= numbers.get(i) && numbers.get(i) <= number2) {
                sum += numbers.get(i);
            }
        }
        System.out.printf("Tổng các số trong khoảng %d đến %d là: %d ", number1, number2, sum);
    }
}
