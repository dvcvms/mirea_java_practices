package ru.mirea.labs.lab11;


import java.security.KeyPair;
import java.util.*;

public class Solution<T, K, V> {
    private ArrayList<T> lst;
    private HashSet<T> hashSet;
    public HashMap<K, V> hashMap;

    public Solution() {
        lst = new ArrayList<>();
        hashSet = new HashSet<>();
        hashMap = new HashMap<>();
    }

    public void newArrayList(T value) {
        lst.add(value);
    }
    public void newHashSet(T value) {
        hashSet.add(value);
    }
    public void newHashMap(K key, V value) {
        hashMap.put(key, value);
    }
}
