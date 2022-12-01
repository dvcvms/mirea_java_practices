package ru.mirea.labs.lab6;


import java.awt.*;
import javax.swing.*;

public class TextGui extends JFrame {
    JTextArea tField = new JTextArea();
    JLabel label = new JLabel("Введите текст: ");

    JMenuBar menuBar = new JMenuBar();

    JMenu fMenu = new JMenu("Шрифт");

    JMenuItem lobster = new JMenuItem("Lobster");
    JMenuItem impact = new JMenuItem("Impact");
    JMenuItem tnr = new JMenuItem("Times New Roman");

    JMenu cMenu = new JMenu("Цвет");

    JMenuItem green = new JMenuItem("Зеленый");
    JMenuItem blue = new JMenuItem("Синий");
    JMenuItem red = new JMenuItem("Красный");

    Font lFont = new Font("Lobster", Font.PLAIN, 20);
    Font imFont = new Font("Impact", Font.PLAIN, 20);
    Font tnrFont = new Font("Times New Roman", Font.PLAIN, 20);

    public TextGui() {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 100, 300, 200);
        frame.setVisible(true);

        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(4, 4, 5, 10);
        grid.setLayout(layout);
        frame.add(grid);

        grid.add(label);
        grid.add(tField);

        frame.setJMenuBar(menuBar);

        menuBar.add(fMenu);
        fMenu.add(lobster);
        fMenu.add(impact);
        fMenu.add(tnr);

        lobster.addActionListener(e -> fontSet("l"));
        impact.addActionListener(e -> fontSet("im"));
        tnr.addActionListener(e -> fontSet("tnr"));

        menuBar.add(cMenu);
        cMenu.add(green);
        cMenu.add(blue);
        cMenu.add(red);

        green.addActionListener(e -> colorSet("green"));
        blue.addActionListener(e -> colorSet("blue"));
        red.addActionListener(e -> colorSet("red"));
    }

    public void fontSet(String a){
        switch(a) {
            case "l" -> tField.setFont(lFont);
            case "im" -> tField.setFont(imFont);
            case "tnr" -> tField.setFont(tnrFont);
        }
    }
    public void colorSet(String a){
        switch(a) {
            case "green" -> tField.setForeground(Color.green);
            case "blue" -> tField.setForeground(Color.blue);
            case "red" -> tField.setForeground(Color.red);
        }
    }
}
