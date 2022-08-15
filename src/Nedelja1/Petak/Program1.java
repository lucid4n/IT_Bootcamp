package Nedelja1.Petak;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        //Unosi sa tastature brojeve 1,2,3,4
        //switch (unos)
        //izlaz "Odgovor je 1" .. "Odgovor je 4"
        //"Odgovor ne postoji! "
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj sa tastature od 1 do 4 ");
        int a = sc.nextInt();

        switch (a){
            case 1 : System.out.println("Odgovor je 1"); break;
            case 2 : System.out.println("Odgovor je 2"); break;
            case 3 : System.out.println("Odgovor je 3"); break;
            case 4 : System.out.println("Odgovor je 4");break;
            default: System.out.println("Odgovor ne postoji! ");
        }
    }
}

