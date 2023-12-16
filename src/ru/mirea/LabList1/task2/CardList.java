package ru.mirea.LabList1.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class CardList {
    private CardNode head;

    public CardList() {
        head = null;
    }

    public void addNode() {
        CardNode newNode = new CardNode();
        newNode.readAttributes();

        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }

        System.out.println("Элемент добавлен в картотеку.");
    }

    public void removeNode() {
        if (head == null) {
            System.out.println("Картотека пуста. Нечего удалять.");
            return;
        }

        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }

        System.out.println("Элемент удален из картотеки.");
    }

    public void displayNode() {
        if (head == null) {
            System.out.println("Картотека пуста.");
            return;
        }

        head.displayAttributes();
    }

    public void clearList() {
        head = null;
        System.out.println("Картотека очищена.");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void writeToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        CardNode current = head;

        while (current != null) {
            writer.write(current.toString());
            writer.write("\n");
            current = current.getNext();
        }

        writer.close();
        System.out.println("Картотека записана в файл " + fileName);
    }

    public void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);

            if (tokenizer.hasMoreTokens()) {
                String name = tokenizer.nextToken();
                int age = tokenizer.hasMoreTokens() ? Integer.parseInt(tokenizer.nextToken()) : 0;

                CardNode newNode = new CardNode();
                newNode.setName(name);
                newNode.setAge(age);

                if (head == null) {
                    head = newNode;
                } else {
                    CardNode current = head;
                    while (current.getNext() != null) {
                        current = current.getNext();
                    }
                    current.setNext(newNode);
                    newNode.setPrev(current);
                }
            }
        }

        reader.close();
        System.out.println("Картотека считана из файла " + fileName);
    }
}
