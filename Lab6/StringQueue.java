package lab6;

import java.util.Arrays;

public class StringQueue {

    private String[] elements;
    private int count = 0;

    public static final int DEFAULT_SIZE = 10;

    public StringQueue() {
        elements = new String[DEFAULT_SIZE];
    }

    public void resize() {
        String[] temp = Arrays.copyOf(elements, elements.length + DEFAULT_SIZE);
        elements = temp;
    }

    public void queue(String item) {
        if (count >= elements.length) {
            resize();
        }
        elements[count++] = item;
    }

    public String dequeue() {
        if (count <= 0) {
            throw new NullPointerException("Pineapple pen!");
        }
        String temp = elements[0];
        for (int i = 0; i < count; i++) {
            elements[i] = elements[i + 1];
        }

        return temp;
    }

    public String peek() {
        if (count <= 0) {
            throw new NullPointerException("Pineapple pen!");
        }
        return elements[count - 1];
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

    public void singit(int position, String x) {
        if (position <= 0)
            throw new IllegalArgumentException("SINGITER!");

        if (count + 1 > DEFAULT_SIZE) {
            resize();
        }

        for (int i = count - 1; i >= position - 1; i--) {
            elements[i + 1] = elements[i];
        }

        elements[position - 1] = x;
        count++;

    }


}











