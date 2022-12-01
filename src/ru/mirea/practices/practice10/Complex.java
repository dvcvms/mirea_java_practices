package ru.mirea.practices.practice10;


public class Complex {
    private int image;
    private int real;

    public Complex(int real, int image) {
        this.image = image;
        this.real = real;
    }

    public Complex() {
    }

    public int getImage() {
        return this.image;
    }

    public int getReal() {
        return this.real;
    }

    public void setImaginary(int imaginary) {
        this.image = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public String toString() {
        return "Complex{real = " + this.real + ", image = " + this.image + "}";
    }
}
