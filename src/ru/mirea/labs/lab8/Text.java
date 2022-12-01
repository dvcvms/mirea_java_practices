package ru.mirea.labs.lab8;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    public String info = " ";
    public void writeText(String filepath) {
        try(FileWriter writer = new FileWriter(filepath, false)){
            System.out.println("Введите текст для записи: ");
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            writer.write(text);
            writer.close();

        } catch (IOException ex) { System.out.println(ex.getMessage()); }
    }

    public void readText(String filepath) {
        try (FileReader reader = new FileReader((filepath))) {
            int c;
            while ((c = reader.read()) != -1) {
                info += (char) c;
                System.out.print((char) c);
            }
            System.out.println();
            reader.close();
        } catch (IOException ex) { System.out.println(ex.getMessage()); }
    }

    public void replaceText(String filepath) {
        try(FileWriter writer = new FileWriter(filepath, false)){
            Scanner sc = new Scanner(System.in);
            System.out.print("Какое слово заменить? ");
            String inf = sc.nextLine();
            System.out.println("На какое слово заменить? ");
            String newInf = sc.nextLine();

            String updatedInfo = info.replace(inf, newInf);
            writer.write(updatedInfo);
        }
        catch(IOException ex) { System.out.println(ex.getMessage());  }
    }

    public void addText(String filepath) {
        try(FileWriter writer = new FileWriter(filepath, true)){
            Scanner sc = new Scanner(System.in);
            String newText = sc.nextLine();
            writer.write(newText);
            writer.close();
        }
        catch(IOException ex) { System.out.println(ex.getMessage());  }
    }
}
