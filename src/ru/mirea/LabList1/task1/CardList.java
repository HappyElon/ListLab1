package ru.mirea.LabList1.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class CardList {
    private ArrayList<CardNode> nodeList;

    public CardList() {
        nodeList = new ArrayList<>();
    }

    public void addNode() {
        CardNode node = new CardNode();
        node.readAttributes();
        nodeList.add(node);
        System.out.println("Элемент добавлен в картотеку.");
    }

    public void removeNode(int index) {
        if (index >= 0 && index < nodeList.size()) {
            nodeList.remove(index);
            System.out.println("Элемент удален из картотеки.");
        } else {
            System.out.println("Неверный индекс элемента.");
        }
    }

    public void displayNode(int index) {
        if (index >= 0 && index < nodeList.size()) {
            nodeList.get(index).displayAttributes();
        } else {
            System.out.println("Неверный индекс элемента.");
        }
    }

    public void clearList() {
        nodeList.clear();
        System.out.println("Картотека очищена.");
    }

    public boolean isEmpty() {
        return nodeList.isEmpty();
    }

    public void writeToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (CardNode node : nodeList) {
            writer.write(node.toString());
            writer.write("\n");
        }
        writer.close();
        System.out.println("Картотека записана в файл " + fileName);
    }

    public void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            String name = tokenizer.nextToken();
            int age = Integer.parseInt(tokenizer.nextToken());

            CardNode node = new CardNode();
            node.setName(name);
            node.setAge(age);

            nodeList.add(node);
        }

        reader.close();
        System.out.println("Картотека считана из файла " + fileName);
    }
}
