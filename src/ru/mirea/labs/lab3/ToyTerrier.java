package ru.mirea.labs.lab3;

public class ToyTerrier extends Dog{
    protected double height = 1;

    public ToyTerrier(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Порода: Той Терьер\n" + "Имя: " + super.getName() + "\nВозраст: " + super.getAge());
        System.out.println("Рост: " + this.height);
    }
}
