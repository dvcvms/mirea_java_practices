package ru.mirea.practices.practice10;


import java.util.Scanner;

public class ConcreteFactory implements ComplexAbstractFactory {
    public ConcreteFactory() {
    }

    public Complex createComplex() {
        Scanner in = new Scanner(System.in);
        int real = in.nextInt();
        int image = in.nextInt();
        Complex com = new Complex(real, image);
        return com;
    }

    public Complex createComplex(int real, int image) {
        Complex com = new Complex(real, image);
        return com;
    }
}