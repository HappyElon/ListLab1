package ru.mirea.LabList1.task1;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CardNode {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}





