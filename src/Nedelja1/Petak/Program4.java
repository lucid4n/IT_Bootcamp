package Nedelja1.Petak;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);

        System.out.println("Unesi broj od 0 do 100 -");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (0 <= input && input <= 100) {
            if (input == x) {
                System.out.println("Broj je jednak");
            } else {
                System.out.println("Broj nije jednak");
            }
            System.out.println("Random broj je " + x);
        }
        else{
            System.out.println("Ulaz nije u dozvoljenim vrednostima ! ");
        }
    }
}

