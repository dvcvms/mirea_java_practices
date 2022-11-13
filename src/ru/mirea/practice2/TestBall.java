package ru.mirea.practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(4.4, 7.5);
        Ball b3 = new Ball(99, 0.41);

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);

        System.out.println();

        b1.setX(15);
        b1.setY(27);
        System.out.println("b1_new: " + b1);

        System.out.println();

        System.out.println("b2_getX: " + b2.getX());
        System.out.println("b2_getY: " + b2.getY());

        System.out.println();

        System.out.println("move b3 ball: x->x+5 y->y+9");
        b3.move(5, 9);
        System.out.println("b3_moved:" + b3);
    }
}
