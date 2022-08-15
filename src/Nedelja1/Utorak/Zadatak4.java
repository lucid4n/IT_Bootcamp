package Nedelja1.Utorak;

import java.util.Scanner;

public class Zadatak4 {
    // Корисник уноси вредност
    // Колико кованица најмање морамо да вратимо за кусур
    // 20 10 5 2 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int count20 = total / 20;

        // total - (count20 * 20)
        // total % 20

        // total = total % 20; // total %= 20; 1. nacin
        // total = total - (count20 * 20); // total -= count20 * 20; 2. nacin
        total = total % 20;

        int count10 = total / 10;
        total = total % 10;

        int count5 = total / 5;
        total = total % 5;

        int count2 = total / 2;
        total = total % 2;

        int count1 = total;

        int totalCoins = count20 + count10 + count5 + count2 + count1;

        System.out.println(totalCoins);
    }
}
