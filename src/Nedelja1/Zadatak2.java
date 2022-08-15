package Nedelja1;

//Korisnik unosi tri broja
//Ispisati najveci broj

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = x; // int max = 0

        if (x > max) {
            max = x;
        }
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        System.out.println(max);
    }

//    // II Начин
//        if(x >= y && x >= z){
//        System.out.println(x);
//    }
//        else if(y >= x && y >= z){
//        System.out.println(y);
//    }
//        else{
//        System.out.println(z);
//    }
}
