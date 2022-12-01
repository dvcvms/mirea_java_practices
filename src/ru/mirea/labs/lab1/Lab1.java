package ru.mirea.labs.lab1;


public class Lab1 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Задание 1:");
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c += a[i];
        }
        System.out.println(c);
        System.out.println("Задание 3:");
        for (int i = 1; i < 11; i++){
            System.out.print("1/" + i + " ");
        }
    }

}
