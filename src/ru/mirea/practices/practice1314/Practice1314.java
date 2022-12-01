package ru.mirea.practices.practice1314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Practice1314 {
    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Задание 2
        Date date_now = new Date();
        Date date_personal = simpleDateFormat.parse(br.readLine());
        System.out.println(date_now.getTime() > date_personal.getTime());
        //Задание 4
        Date date = simpleDateFormat.parse(br.readLine());
        Calendar calendar = new GregorianCalendar();
        System.out.println("Date = " + simpleDateFormat.format(date.getTime()));
        System.out.println("Calendar = " + simpleDateFormat.format(calendar.getTime()));
    }
}


