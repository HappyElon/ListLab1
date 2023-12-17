package ru.mirea.LabList1.task3;

import java.util.Scanner;

class Node {
    String name;
    int age;

    Node next;

    Node(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
