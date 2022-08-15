package Nedelja1.Cetvrtak;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        // Унос и испис бројева док се не унесе 0
        //boolean
        Scanner sc = new Scanner(System.in);
        System.out.println("Unosi broj, ako želiš da prekineš unesi 0 - ");
        int input = sc.nextInt();
        while(input != 0) {
            System.out.println(input);
            System.out.println("Unosi broj, ako želiš da prekineš unesi 0 - ");
            input = sc.nextInt();
        }


    }
}
