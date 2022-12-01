package ru.mirea.practices.practice5;

import java.util.Scanner;

public class Practice5 {

    //ex4
    static int ex4(int k, int s) {
        return ex4(0, 0, k, s);
    }

    static int ex4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c;
        if (len == 0) {
            c = 1;
        } else {
            c = 0;
        }
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += ex4(len + 1, sum + i, k, s);
        }
        return res;
    }

    //ex5
    static int ex5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + ex5(n / 10);
        }
    }

    //ex6
    private static void ex6(int numb) {
        ex6(numb, 2);
    }

    private static void ex6(int numb, int div) {
        if (numb == 2) {
            System.out.println("YES");
            return;
        }
        if (numb % div == 0) {
            System.out.println("NO");
            return;
        }
        if (numb == 1) {
            System.out.println("NO");
            return;
        }
        if (div > Math.sqrt(numb)) {
            System.out.println("YES");
            return;
        }
        ex6(numb, div + 1);
        return;
    }

    //ex7
    static int ex7(int n) {
        return ex7(n, 2);
    }

    static int ex7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return 0;
        }
        if (n % k == 0) {
            System.out.println(k);
            return ex7(n / k, k);
        } else {
            return ex7(n, ++k);
        }
    }

    //ex8
    private static void ex8(String s) {
        if (s.length() == 1) {
            System.out.println("YES");
            return;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            System.out.println("NO");
            return;
        }
        if (s.length() == 2) {
            System.out.println("YES");
            return;
        }
        ex8(s.substring(1, s.length() - 1));
    }

    //test
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        String s;
        System.out.print("Введите номер задания(4-8): ");
        a = in.nextInt();
        switch (a) {
            case 4:
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(ex4(a, b));
                in.close();
                break;
            case 5:
                a = in.nextInt();
                System.out.println(ex5(a));
                in.close();
                break;
            case 6:
                a = in.nextInt();
                ex6(a);
                in.close();
                break;
            case 7:
                a = in.nextInt();
                ex7(a);
                in.close();
                break;
            case 8:
                s = in.nextLine();
                s = in.nextLine();
                if (s.length() == 0) {
                    System.out.println("Введена пустая строка");
                    break;
                }
                ex8(s);
                in.close();
                break;
            default:
                System.out.println("Неверный номер задания");
                break;
        }
    }
}