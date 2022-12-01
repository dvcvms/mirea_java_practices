package ru.mirea.labs.lab3;


public class SheepDog extends Dog{
    protected String color = "BLACK";
    public SheepDog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public void displayInfo() {
        System.out.println("Имя: " + super.getName() + "\nВозраст: " + super.getAge());
        System.out.println("Расцветка: " + this.color);
    }
}
