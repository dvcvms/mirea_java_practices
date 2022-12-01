package ru.mirea.labs.lab10;


import java.util.ArrayList;
import java.util.List;

public class Test<E> {
    private List<E> lst;
    public List<E> arrInList(E arr[]) {
        lst = new ArrayList<E>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            lst.add(arr[i]);
        };
        return lst;
    }
    public void print() {
        if (lst.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(lst.get(i));
            };
        }
    }
}
