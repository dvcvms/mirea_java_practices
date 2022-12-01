package ru.mirea.labs.lab11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution<Integer, String, Long> solution = new Solution<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        for (int i = 0; i < 5; i++) {
            solution.newArrayList(i);
            solution.newHashSet(i);
            str = scanner.nextLine();
            solution.newHashMap(str, (long) i);
        }
        System.out.println(solution.hashMap);

        Solution<Integer, Integer, Character> solution2 = new Solution<>();
        Integer n;
        for (int i = 97; i < 104; i++) {
            solution2.newArrayList(i);
            solution2.newHashSet(i);
            n = scanner.nextInt();
            solution2.newHashMap(n, (char)i);
        }
        System.out.println(solution2.hashMap);
    }
}
