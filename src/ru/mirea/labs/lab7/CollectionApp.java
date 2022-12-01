package ru.mirea.labs.lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionApp {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> breed = new ArrayList<String>();

        breed.add("Корги");
        breed.add("Хаски");
        breed.add("Бульдог");
        breed.add("Овчарка");
        breed.add(1, "Чихуа-хуа");

        System.out.println("\nЗапись под номером 1: ");
        System.out.print(breed.get(1));

        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.println("\nЗаменить на слово: ");
        temp = sc.next();
        breed.set(1, temp);
        System.out.println(breed.get(1));

        System.out.println("\nВ списке " + breed.size() + " элементов");
        System.out.println("\nСписок: ");
        for (String dog : breed) System.out.println(dog);

        if(breed.contains("Корги")) System.out.println("\nВ списке есть Корги");
        if(breed.contains("Овчарка")) System.out.println("В списке есть Овчарка\n");

        System.out.println("\nКакую породу убрать из списка?");
        temp = sc.next();

        breed.remove(temp);
        System.out.println("\nОбновленный список");
        Object[] dogs = breed.toArray();
        for (Object dog : dogs) {
            System.out.println(dog);
        }
    }
}
