package ru.mirea.practices.practice6;


public class Practice6 {
    public static void main(String[] args) {
        String[] s1 = new String[5];
        s1[0] = "Волков Максим";
        s1[1] = "Чумак Михаил";
        s1[2] = "Рогозин Илья";
        s1[3] = "Староверов Роман";
        s1[4] = "Ляхин Григорий";
        String[] s2 = new String[5];
        s2[0] = "Шульгин Влад";
        s2[1] = "Зорина Мария";
        s2[2] = "Парадеев Александр";
        s2[3] = "Дедова Анастасия";
        s2[4] = "Немцов Илья";
        System.out.println("\nПервая группа: ");
        for (int i = 0; i < s1.length; i++) System.out.println("\t" + s1[i] + " ");
        System.out.println("\nВторая группа: ");
        for (int i = 0; i < s2.length; i++) System.out.println("\t" + s2[i] + " ");

        //объединяем массивы
        String[] s = new String[10];
        for (int i = 0; i < 5; i++) {
            s[i] = s1[i];
            s[i + 5] = s2[i];
        }
        //сортируем
        Sort sort = new Sort();
        sort.merge(s, 0, s.length - 1);
        System.out.println("\nОбщий список после сортировки: ");
        for (int i = 0; i < s.length; i++) System.out.println("\t" + s[i] + " ");
    }
}
