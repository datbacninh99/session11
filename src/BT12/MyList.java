package BT12;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(2);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return true;
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(2);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= size) {
            int newSize = size * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public E get(int i) {
        if (i < size) {
            return (E) elements[i];
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}