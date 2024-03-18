package ra.example;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();

        // Thêm vào chuỗi
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        for (Integer number : list) {
            System.out.println(number);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("ptu " + iterator.next());
        }

        // Sửa, chưa có
        // Xóa theo giá trị
        list.remove(2);
        System.out.println(list);
        // Kích thươc danh sách
        System.out.println(list.size());
        // list.isEmpty();
        // Xóa tất cả phần tử
        list.clear();
        System.out.println(list);

        // List
        List<String> arrayList = new LinkedList<>();
        arrayList.add(0, "Quanh đi muôn 1");
        arrayList.add(0, "Quanh đi muôn 2");
        arrayList.add(0, "Quanh đi muôn 3");
        arrayList.add(0, "Quanh đi muôn 4");
        arrayList.add(0, "Quanh đi muôn 5");
        System.out.println(arrayList);
        // Sửa
        arrayList.set(3, "Học bài");
        System.out.println(arrayList);
        // Xóa theo vị trí
        arrayList.remove(3);
        System.out.println(arrayList);
        // indexOf
        // Lấy ra theo vị trí
        System.out.println(arrayList.get(0));
    }
}