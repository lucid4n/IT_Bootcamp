package Nedelja2.Utorak;

import java.util.Scanner;

public class NiskeFunkcije {
    public static boolean contains2(String str, char c) {
        boolean contains = false; // Flag
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                contains = true;
            }
        }

        return contains;
    }


    public static int indexOf2(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1; // Ако није нашао ништа, враћа -1,
                   // јер тај индекс не постоји у нашој петљи
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(contains2(s, '%'));
        System.out.println(indexOf2(s, '%'));
    }
}


