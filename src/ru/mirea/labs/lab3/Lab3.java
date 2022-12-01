package ru.mirea.labs.lab3;


public class Lab3 {

    public static void main(String[] args) {
        SheepDog d1 = new SheepDog("Барон", 12, "Коричневый");
        d1.displayInfo();
        ToyTerrier d2 = new ToyTerrier("Грейс", 2, 18);
        d2.displayInfo();
    }
}

