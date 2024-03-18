package ra.example;

public class MyArray<E> {
    E[] array;

    public void printArray(E[] arr) { // In ra mảng
        for (E e : arr) {
            System.out.println(e);
        }
    }
}