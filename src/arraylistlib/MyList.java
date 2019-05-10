package arraylistlib;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        if (size >= elements.length) {
            ensureCapacity(1);
        }
        for (int i = size -1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = index; i < elements.length - 2; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    @Override
    public E clone() {
        MyList myList = new MyList();
        myList.elements = Arrays.copyOf(elements, elements.length);
        myList.size = size;
        return (E)(myList);
    }

    public boolean contains(E e) {
        for (Object element : elements) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        this.add(size, e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, elements.length + minCapacity);
    }

    public E get(int i) {
        return (E)elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
