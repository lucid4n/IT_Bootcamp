package Nedelja1.Petak;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input;

        boolean prekidac = true;

        while(prekidac){

            System.out.println("Unesi A/C/G/T : ");
            input = sc.next().charAt(0);

            switch (input){
                case 'A' : System.out.println("Adenin"); break;
                case 'C' : System.out.println("Citozin"); break;
                case 'G' : System.out.println("Guanin "); break;
                case 'T' : System.out.println("Timin"); break;
                default: System.out.println("Greška"); prekidac = false;

            }



        }


    }
}
