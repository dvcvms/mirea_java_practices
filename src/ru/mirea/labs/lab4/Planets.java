package ru.mirea.labs.lab4;


public class Planets implements Nameable{
    String[] planet = new String[] {"Меркурий", "Венера", "Земля", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
    int num;
    Planets() {this.num = -1;}
    void setNum(int num) {
        this.num = num;
    }
    public void getName() {
        System.out.println("На " + this.num + " -ем месте находится планета " + planet[this.num-1] + "\n");
    }
}
