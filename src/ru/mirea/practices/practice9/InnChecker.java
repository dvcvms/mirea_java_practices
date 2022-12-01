package ru.mirea.practices.practice9;


import java.math.BigInteger;
import java.util.Scanner;

public class InnChecker {
    public InnChecker() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Введите номер ИНН: ");

            try {
                BigInteger inn = new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            } catch (InnNotValidException var3) {
                System.out.println(var3.getLocalizedMessage());
            }
        }

        System.out.println("ИНН действителен");
    }

    public static boolean checkInn(BigInteger inn) throws InnNotValidException {
        int i = 0;

        for(BigInteger cInn = new BigInteger(inn.toByteArray()); !cInn.equals(new BigInteger("0")); cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray())) {
            ++i;
        }

        if (i != 10 && i != 12) {
            throw new InnNotValidException(inn);
        } else {
            return true;
        }
    }
}
