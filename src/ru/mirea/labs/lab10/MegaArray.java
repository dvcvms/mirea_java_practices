package ru.mirea.labs.lab10;

public class MegaArray<E> {
    private E[] arr;

    public MegaArray(E[] arr) {
        this.arr = arr;
    }

    public E get(int index) {
        return arr[index];
    }

    public void set(int index, E num) {
        arr[index] = num;
    }
}
