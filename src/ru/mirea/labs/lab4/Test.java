package ru.mirea.labs.lab4;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Planets pl = new Planets();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер планеты: ");
        int temp = sc.nextInt();
        pl.setNum(temp);
        pl.getName();
    }
}
