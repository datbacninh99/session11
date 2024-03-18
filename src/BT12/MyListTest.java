package BT12;

public class MyListTest {
    public static void main(String args[]) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("Phần tử 4: " + listInteger.get(4));
        System.out.println("Phần tử 1: " + listInteger.get(1));
        System.out.println("Phần tử 2: " + listInteger.get(2));

        listInteger.add(6);
        System.out.println("Phần tử 6: " + listInteger.get(5));
        listInteger.add(1, 10);
        System.out.println("Phần tử 10: " + listInteger.get(1));
        listInteger.add(2, 11);
        System.out.println("Phần tử 11: " + listInteger.get(2));
    }
}