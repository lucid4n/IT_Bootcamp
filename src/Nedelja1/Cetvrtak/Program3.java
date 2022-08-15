package Nedelja1.Cetvrtak;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        // Мост има носивост M, написати програм који учитава број аутомобила на мосту,
        // а затим и масу сваког од њих.
        // Затим исписати да ли мост може да издржи све аутомобиле или не
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi nosivost mosta - ");
        int M = sc.nextInt();
        System.out.println("Unesi broj automobila - ");
        int brojAutomobila = sc.nextInt();
        int sumaMase = 0;

        for(int i = 1; i <= brojAutomobila; i++){
            System.out.println("Unesi masu automobila " + i + " - ");
            int masaIndividualnogAutomobila = sc.nextInt();
            sumaMase = sumaMase + masaIndividualnogAutomobila;
            System.out.println("Trenutna suma je " + sumaMase);
        }

        if(sumaMase > M){
            System.out.println("Most ne može da izdrži sve automobile");
        }
        else{
            System.out.println("Most može da izdrži sve automobile");
        }

    }
}

