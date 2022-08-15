package Nedelja1.Utorak;

import java.util.Scanner;

public class Zadatak9 {
    // 3. Да ли је троугао валидан? - Корисник уноси странице троугла (нпр a,b,c)
    // - Троугао је валидан ако је збир сваке две странице ВЕЋИ од треће странице
    // - Исписати true/false

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(a + b > c && a + c > b && b + c > a);


    }
}

