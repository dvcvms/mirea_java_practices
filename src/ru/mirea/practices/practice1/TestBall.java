package ru.mirea.practices.practice1;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball();
        Ball b2 = new Ball("Orange");
        Ball b3 = new Ball("Red", 7);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println();

        System.out.println("b1_d: " + b1.getDiameter());
        System.out.println("b2_d: " + b2.getDiameter());
        System.out.println("b3_d: " + b3.getDiameter());

        System.out.println();

        System.out.println("b1_c: " + b1.getColor());
        System.out.println("b2_c: " + b2.getColor());
        System.out.println("b3_c: " + b3.getColor());

        System.out.println();

        b2.setColor("blue");

        System.out.println("b2_c_new: " + b2);

        System.out.println();
        b1.setDiameter(8);

        System.out.println("b1_d_new: " + b1);
    }
}
