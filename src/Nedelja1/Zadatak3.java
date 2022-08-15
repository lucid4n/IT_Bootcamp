package Nedelja1;

import java.util.Scanner;

public class Zadatak3 {
    // 1. Написати програм за пивницу, који од корисника тражи да унесе број година (цео број)
    //     - Ако корисник има строго мање од 18 година, понудити му сок (println)
    //     - Ако корисник има више од 18 година, понудити му пиво

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age > 0){
            if(age < 18){
                System.out.println("Sok");
            }
            else {
                System.out.println("Pivo");
            }
        }
        else{
            System.out.println("Pogresan unos");
        }
    }
}
