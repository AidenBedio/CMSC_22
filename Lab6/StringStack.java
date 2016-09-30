package lab6;


import java.util.Arrays;

public class StringStack {

    private String[] elements;
    private int count = 0;
    public static final int DEFAULT_SIZE = 10;

    public StringStack() {
        this(DEFAULT_SIZE);
    }

    public StringStack(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("Apple pen Pineapple pen!!!");

        elements = new String[size];
    }


    public void push(String item) {
        if (count >= elements.length) {
            String[] temp = Arrays.copyOf(elements, elements.length + DEFAULT_SIZE);
            elements = temp;
        }
        elements[count++] = item;
    }

    public String pop() {
        if (count <= 0) {
            throw new NullPointerException("Pineapple pen!");
        }
        return elements[--count];
    }

    public String peek() {
        if (count <= 0) {
            throw new NullPointerException("Pineapple pen!");
        }
        return elements[count - 1];
    }

    public String pop(int n) {
        if (count - n < 0) {
            throw new IllegalArgumentException("Yas yas");
        }

        count -= n;
        return elements[count];
    }

    public int size() {
        return count;
    }

    public String toString() {
        String str = "";
        int i = 0;
        for (; i < elements.length - 1; i++) {
            str += elements[i] + ",";
        }

        return str += elements[i];
    }


}











