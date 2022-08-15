package Nedelja1.Utorak;

import java.util.Scanner;

public class Zadatak7 {
    // 1. Да ли је број дељив са 5 или са 11 или са оба (или није ни са чим од наведеног)
    // 5
    // 11
    // 5 11
    //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // if(x % 5 == 0 && x % 11 != 0){
        //     System.out.println("x је дељиво са 5");
        // }
        // else if(x % 11 == 0 && x % 5 != 0){
        //     System.out.println("x је дељиво са 11");
        // }
        // else if(x % 5 == 0 && x % 11 == 0){
        //     System.out.println("x је дељиво са 5 и са 11");
        // }
        // else{
        //     System.out.println("x није дељиво ни са 5 ни са 11");
        // }

        // if(x % 5 == 0 && x % 11 == 0){
        //     System.out.println("x је дељиво са 5 и са 11");
        // }
        // else if(x % 5 == 0){
        //     System.out.println("x је дељиво са 5");
        // }
        // else if(x % 11 == 0){
        //     System.out.println("x је дељиво са 11");
        // }
        // else{
        //     System.out.println("x није дељиво ни са 5 ни са 11");
        // }

        if(x % 5 == 0){
            System.out.println("x је дељиво са 5");
        }

        if(x % 11 == 0){
            System.out.println("x је дељиво са 11");
        }

        if(x % 5 != 0 && x % 11 != 0){
            System.out.println("x није дељиво ни са 5 ни са 11");
        }
    }
}
