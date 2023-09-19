package org.example;

public class Task2 {
    public static void main(String[] args) {
        String name1 = "Вячеслав";
        String name2 = "Дмитрий";

        if (name1 == "Вячеслав") { // Пример, в случае совпадения имени
            System.out.println("Привет, " + name1);
        } else {
            System.out.println("Нет такого имени");
        }

        if (name2 == "Вячеслав") { // Пример, в случае не совпадения имени
            System.out.println("Привет, " + name1);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
