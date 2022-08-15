package Nedelja1.Petak;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int brojac1 =0;
        int brojac2 =0;
        int brojac3 =0;
        int brojac4 =0;
        int brojac5 =0;
        int brojac6 =0;
        int brojac7 =0;
        int brojac8 =0;
        int brojac9 =0;

        boolean stop = true;
        while(stop){
            System.out.println("Unesite broj od 1 do 9");
            String num = sc.next();
            switch (num){
                case "1": brojac1 +=1;break;
                case "2": brojac2 +=1;break;
                case "3": brojac3 +=1;break;
                case "4": brojac4 +=1;break;
                case "5": brojac5 +=1;break;
                case "6": brojac6 +=1;break;
                case "7": brojac7 +=1;break;
                case "8": brojac8 +=1;break;
                case "9": brojac9 +=1;break;
                case "STOP" : stop =false;
            }
        }
        System.out.println("1:" + brojac1);
        System.out.println("2:" + brojac2);
        System.out.println("3:" + brojac3);
        System.out.println("4:" + brojac4);
        System.out.println("5:" + brojac5);
        System.out.println("6:" + brojac6);
        System.out.println("7:" + brojac7);
        System.out.println("8:" + brojac8);
        System.out.println("9:" + brojac9);
    }
}

