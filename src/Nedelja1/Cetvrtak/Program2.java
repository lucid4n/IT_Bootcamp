package Nedelja1.Cetvrtak;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        System.out.println("Unesi broj - ");
        int n = cs.nextInt();
        int sumaParnih = 0;
        int sumaNeparnih = 0;

        for(int i = 0;i<n; i+=2){
            sumaParnih = sumaParnih + i;
        }
        for(int i =1; i<n; i+=2){
            sumaNeparnih =sumaNeparnih + i;
        }
        System.out.println("Suma parnih - " + sumaParnih);
        System.out.println("Suma neparnih - " + sumaNeparnih);

    }

}

