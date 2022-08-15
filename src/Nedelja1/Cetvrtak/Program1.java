package Nedelja1.Cetvrtak;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj - ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 0; i <= n; i++) {
            suma = suma + i;

        }

        System.out.println("Zbir je " + suma);

    }
}

