package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arrayString = {"VolksWagen", "Audi", "Ford", "Chevrolet", "Peugeot"};
        Integer[] arrayInteger = {100, 2, 6, 4, 8, 600, 2, 50};

        showMe(arrayString);
        showMe(arrayInteger);

        System.out.println(doExist(arrayInteger));
        System.out.println(doExist(arrayString));

        System.out.println(max(arrayInteger));
        System.out.println(max(arrayString));

        System.out.println(min(arrayInteger));
        System.out.println(min(arrayString));

        arrayString = (String[]) lastElement(arrayString);
        arrayInteger = (Integer[]) lastElement(arrayInteger);

        showMe(arrayString);
        showMe(arrayInteger);

        Stack<String> stack = new Stack<>();
        stack.push("bread");
        stack.push("burguers");
        stack.pop();
        System.out.println(stack.size());
        stack.showMe();
    }

    private static<T> void showMe(T[] array) {
        for (T arr : array)
            System.out.printf("%s ", arr);
        System.out.println();
    }

    private static <T> Object lastElement(T[] element) {
        return Arrays.copyOf(element, element.length-1);
    }

    private static<T extends Comparable> Object min(T[] array) {
        T min = array[0];
        for (T arr : array)
            if (arr.compareTo(min) < 0)
                min = arr;
        return min;
    }

    private static <T extends Comparable> Object max(T[] array) {
        T max = array[0];
        for (T arr : array) {
            if (arr.compareTo(max) > 0) {
                max = arr;
            }
        }
        return max;
    }

    private static <T> boolean doExist(T[] array) {
        if (array.length > 0)
            return true;
        return false;
    }
}
