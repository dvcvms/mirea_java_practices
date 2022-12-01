package ru.mirea.labs.lab12;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class test {
    public static void main(String[] args) {
        //String regex = "([0-1][0-2])|([0-9]|12)/([0-2][0-9])|(3|[0-1])/([0-2022])";
        String regex = "(0[1-9]|1[012])[\\/](0[1-9]|[12][0-9]|3[01])[\\/](19|20)\\d\\d";
        //String regex = "(0[1-9]|1[012])[/.](0[1-9]|[12][0-9]|3[01])[/.](19|20)\\d\\d";
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

//парсит строку на подстроку, найти вхождения даты, найти все американские даты