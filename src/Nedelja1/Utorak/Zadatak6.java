package Nedelja1.Utorak;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak6 {
    // Написати програм који конвертује C у F
    // И обрнуто
    // Корисник прво уноси C или F (шта он уноси)
    // Ми исписујемо вредност у другом систему

    // C 37.2 -> 98
    // F = (C * 9/5) + 32

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Изаберите степен из ког претварате: За C унесите 1, за F унесите 2: ");
        ///////////////////////////////////////////////////
        String degreeChoice = sc.nextLine().toLowerCase(Locale.ROOT); // "C" "F" Одмах претварамо у мала слова
        System.out.println("Унесите вредност у изабраном систему: ");
        float value = sc.nextFloat();
        double result = 0.0;

        if(degreeChoice.equals("c")){
            result = value * 9 / 5 + 32; // Имплицитна конверзија
        }
        else if(degreeChoice.equals("f")){
            result = (float)5 / 9 * (value - 32); // Експлицитна конверзија
            // double result = 5.0 / 9 * (value - 32);
        }
        else{
            result = 0.0f;
            System.out.println("Неправилан унос");
        }

        System.out.println(result); // Променљива је видљива само унутар блока где је декларисана
        ///////////////////////////////////////////////////

        // int degreeChoice = sc.nextInt();
        //
        // if(degreeChoice == 1){
        //
        // }
        // else if(degreeChoice == 2){
        //
        // }
        // else{
        //     System.out.println("Неправилан унос");
        // }
    }
}

