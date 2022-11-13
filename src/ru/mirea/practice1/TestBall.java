package ru.mirea.practice1;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball();
        Ball b2 = new Ball("Orange");
        Ball b3 = new Ball("Red", 7);

        System.out.println(b1);
        b1.setDiameter(8);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.getDiametr();
        b2.getDiametr();
        b3.getDiametr();
    }
}
