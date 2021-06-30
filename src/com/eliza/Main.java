package com.eliza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Cześć " + name);

        if (name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        }

        if (!name.endsWith("a")) {
            System.out.println("Jesteś mężczyzną");
        }

        // Inny sposób:

        if (name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else {
            System.out.println("Jesteś mężczyzną");
        }

        // więcej warunków niż jeden

        if (name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else if (name.endsWith("l")) {
        System.out.println("Twoje imię kończy się na literę l");
        } else {
            System.out.println("Jesteś mężczyzną");
        }

        // Warunek przy warunku oraz operator i - &&

        if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else if (!name.isEmpty() && !name.endsWith("a")) {
            System.out.println("Jesteś mężczyzną");
        } else {
            System.out.println("Podaj imię, imię nie może być puste.");
        }

        // operator lub

        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))) {
            System.out.println("Jesteś mężczyzną");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else {
            System.out.println("Podaj imię, imię nie może być puste.");
        }

        // string i int
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        System.out.println("Masz " + age + " lat");

        if (age >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Jesteś niepełnoletni");
        }
    }
}
