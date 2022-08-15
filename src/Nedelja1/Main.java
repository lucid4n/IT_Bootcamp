package Nedelja1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Nesto da ispisemo");
//        System.out.print("jjehgjg");

//        System.out.print("jjehgjg");

//        Referentni tip => Klasa
        Scanner sc = new Scanner(System.in); // Може да ради са разним стварима за читање текста.
       /* //Celobrojni - byte, short, int, long
        int x; // Deklaracija
        x = 5; // Definicija

        int y = 7;
        System.out.println("Z:");
        int z = sc.nextInt();

        System.out.println(z);
//        Realni - float, double
//        pi - 3.14 Нетачно је јер треба библиотека Math.PI

        */
       /* System.out.print("d:");
        float d = sc.nextFloat();

        //boolean - true and false
        //Uslovi
        //Provera
        boolean proveriNesto;
        proveriNesto = 5>=3;

        System.out.println(proveriNesto);

        //String -> char

        String s = "djfskfjeak";
        */

//Korisnik unosi ceo broj od 1 do 7 (6,7 su subota i nedelja)
        /*
        System.out.println("Enter weekday number: ");
        int weekday = sc.nextInt();

        if (weekday == 1) {
            System.out.print("Ponedeljak");
        } else if (weekday == 2) {
            System.out.print("Utorak");
        } else if (weekday == 3) {
            System.out.print("Sreda");
        } else if (weekday == 4) {
            System.out.print("Cetvrtak");
        } else if (weekday == 5) {
            System.out.print("Petak");
        } else if (weekday == 6) {
            System.out.print("Subota");
        } else if (weekday == 7) {
            System.out.print("Nedelja");
        } else {
            System.out.println("Molimo unesite broj izmеđu 1 i 7");
        }

*/
        /*
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = 0;

        if (x > max) {
            max = x;
        }
        if (y > max)
        {
            max = y;
        }
        if(z>max)
        {
            max=z;
        }

        System.out.println(max);
*/
// Написати програм за пивницу, који од корисника тражи да унесе број година (цео број)

        System.out.println("Molimo Vas unesite broj godina: ");
        int godine = sc.nextInt();

        if (godine < 18) {
            System.out.println("Imate manje od 18 godina, poslužite se sokom");
        }
        else if (godine >= 18) {
            System.out.println("Imate više od 18 godina, poslužite se pivom ili rakijom :D");
        }
        else if (godine < 0) {
            System.out.println("Uneli ste pogrešan unos");
        }
        else {
            System.out.println("Pogrešan unos");
        }

        int day;
        System.out.println("Unesi redni broj dana: ");
        day = sc.nextInt();

        if(day == 1) {
        }
        else if (day == 10){
        }
        else if (day == 2){
            System.out.println("Nije vikend");
        }
        else if (day == 3){
        }
        else if (day == 4){
        }
        else if (day == 5){
        }
        else if (day == 6){
        }
        else if (day == 7){
        }
        else if (day == 2){
        }

        else System.out.println( "Pogresan unos");
        {
        }




    }}

