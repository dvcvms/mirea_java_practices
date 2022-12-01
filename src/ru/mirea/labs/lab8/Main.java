package ru.mirea.labs.lab8;


public class Main {
    public static void main(String[] args) {
        String filepath = "src\\text.txt";
        Text text = new Text();
        System.out.println("\n Запись в файл: ");
        text.writeText(filepath);
        System.out.println("\n Чтение из файла: ");
        text.readText(filepath);
        System.out.println("\n Замена слова: ");
        text.replaceText(filepath);
        System.out.println("\n Результат: ");
        text.readText(filepath);
        System.out.println("\n Добавление информации в файл: ");
        text.addText(filepath);
        System.out.println("\n Результат: ");
        text.readText(filepath);
    }
}
