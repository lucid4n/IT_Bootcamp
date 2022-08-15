package Nedelja1.Utorak;

import java.util.Scanner;

public class Zadatak8 {
    // 2. Корисник уноси приходе и расходе, исписати да ли је корисник остварио профит или губитак, и написати колики је
    //
    // - нпр уносе се Приход 100 и Расход 150 -> Резултат је - Губитак: 50
    // - нпр уносе се Приход 1000 и Расход 250 -> Резултат је - Профит: 750

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prihod = sc.nextInt();
        int rashod = sc.nextInt();

        // if(prihod > rashod){
        //     System.out.println("Профит: " + (prihod - rashod));
        // }
        // else if(prihod == rashod){
        //     System.out.println("Нема ни профита ни губитка");
        // }
        // else{
        //     System.out.println("Расход: " + (rashod - prihod));
        // }

        int rezultat = prihod - rashod;

        if(rezultat > 0){
            System.out.println("Профит: " + rezultat);
        }
        else if(rezultat == 0){
            System.out.println("Нема ни профита ни губитка");
        }
        else{
            rezultat *= -1;
            System.out.println("Расход: " + rezultat);
        }
    }
}

