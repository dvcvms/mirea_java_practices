package ru.mirea.labs.lab10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задание 1 + 4
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Test test = new Test();
        List<Integer> lst = test.arrInList(arr);
        System.out.println("Элементы нового списка:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(lst.get(i));
        }
        test.print();
        //Задание 2 + 3
        Long[] arr_long = new Long[10];
        MegaArray<Long> megaArray = new MegaArray<Long>(arr_long);
        for (int i = 0; i < arr.length; i++) {
            megaArray.set(i, (long)i);
        }
        System.out.println("Элементы нового массива:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(megaArray.get(i));
        }
    }
}
