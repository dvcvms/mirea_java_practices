package ru.mirea.labs.lab2;


public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle (12.5, 3.0, 2.0);
        System.out.println(c1);
        System.out.println(c1.getRadius());
        c1.setX(20.0);
        System.out.println(c1);
    }
}
