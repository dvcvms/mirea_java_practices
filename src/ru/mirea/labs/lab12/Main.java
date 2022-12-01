package ru.mirea.labs.lab12;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        //Задание 2
        String regex = "abcdefghijklmnopqrstuv18340";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean matches = Pattern.matches(regex, text);
        System.out.println("Соответствие = " + matches);
        //Задание 4
        String regex1 = "[a-z0-9!$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();
        boolean matches1;
        if (matches1 = Pattern.matches(regex1, text1)) {
            System.out.println("Соответствие = " + matches1);
        }
        else if (text.contains("@localhost")) {
            System.out.println("Соответствие = " + true);
        }
        else {
            System.out.println("Соответствие = " + false);
        }
        //Задание 5
        Scanner scanner2 = new Scanner(System.in);
        String password = scanner2.nextLine();
        String regex2 = "^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$";
        boolean matches2 = Pattern.matches(regex2, password);
        System.out.println("Соответствие = " + matches2);
    }
}

//парсит строку на подстроку, который найти вхождения даты, найти все американские даты
