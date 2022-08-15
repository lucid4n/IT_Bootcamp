package Nedelja1;

import java.util.Scanner;

//Korisnik unosi ceo broj od 1 do 7 (6,7 su subota i nedelja)

public class Zadatak1 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int day;
        System.out.println("Unesite redni broj dana: ");
    day = sc.nextInt();

        if (day == 1) {
            System.out.print("Ponedeljak");
        } else if (day == 2) {
            System.out.print("Utorak");
        } else if (day == 3) {
            System.out.print("Sreda");
        } else if (day == 4) {
            System.out.print("Cetvrtak");
        } else if (day == 5) {
            System.out.print("Petak");
        } else if (day == 6) {
            System.out.print("Subota");
        } else if (day == 7) {
            System.out.print("Nedelja");
        } else {
            System.out.println("Molimo unesite broj izmеđu 1 i 7");
        }

        // if (day >= 1 && day <= 5) {
        //     System.out.println("Није викенд :(");
        // }
        // else if (day >= 6 && day <= 7)
        // {
        //     System.out.println("Викенд :)");
        // }
        // else
        // {
        //     System.out.println("Погрешан унос");
        // }
    }


    }