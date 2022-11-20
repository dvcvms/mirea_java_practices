package ru.mirea.practice6;

import java.util.Arrays;

public class Sort {
    public void merge(String[] a, int low, int high) {
        if (high <= low) return;

        int mid = low + (high - low) / 2;
        merge(a, low, mid);
        merge(a, mid + 1, high);

        String[] arr = Arrays.copyOf(a, a.length);

        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = arr[j];
                j++;
            } else if (j > high) {
                a[k] = arr[i];
                i++;
            } else if (arr[j].charAt(0) < arr[i].charAt(0)) {
                a[k] = arr[j];
                j++;
            } else {
                a[k] = arr[i];
                i++;
            }
        }
    }
}
