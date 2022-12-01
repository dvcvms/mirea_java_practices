package ru.mirea.labs.lab12;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2{
    public static void main(String[] args) {
        String regex = "(0[1-9]|1[012])[\\/](0[1-9]|[12][0-9]|3[01])[\\/](19|20)\\d\\d";
        String string = "02/31/2022 30/11/2022 30.11.2022 12/32/2022 11/20/2022 ";

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Совпадение: " + matcher.group(0));

        }
    }
}