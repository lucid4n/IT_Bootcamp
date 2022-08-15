package Nedelja1.Utorak;

import java.util.Scanner;

public class Zadatak5 {
    // Претворити број дана у бр. година, недеља и дана
    // Година увек има 365 дана

    // 423 дана
    // 1 година (1 * 365) -- 58 дана
    // 8 недеља (8 * 7) -- 2 дана
    // 2 дана

    // 423 динара
    // 365
    // 7
    // 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDays = sc.nextInt();

        int years = totalDays / 365;

        int weeks = (totalDays % 365) / 7;

        int days = (totalDays % 365) % 7;

        System.out.println("Број година: " + years);
        System.out.println("Број недеља: " + weeks);
        System.out.println("Број дана: " + days);
    }
}

