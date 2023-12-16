package ru.mirea.LabList1.task2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CardNode {
    private String name;
    private int age;
    private CardNode next;
    private CardNode prev;

    public CardNode() {
        next = null;
        prev = null;
    }

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

    public CardNode getNext() {
        return next;
    }

    public void setNext(CardNode next) {
        this.next = next;
    }

    public CardNode getPrev() {
        return prev;
    }

    public void setPrev(CardNode prev) {
        this.prev = prev;
    }
}



