package ru.mirea.practices.practice8;


import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<E>();

    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        return content.poll();
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> c) {
        Iterator<E> it = c.iterator();
        while (it.hasNext())
            if (!content.contains(it.next()))
                return false;
        return true;
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }


    public WaitList() {}

    public WaitList(Collection<E> c) {
        Iterator<E> it = c.iterator();
        while (it.hasNext())
            content.add(it.next());
    }

    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}