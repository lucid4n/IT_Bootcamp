package Nedelja2.Utorak;

import java.util.Scanner;

public class ScannerUvod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        System.out.println(s1);

        // int x = sc.nextInt();
        // sc.nextLine();
        int x = Integer.parseInt(sc.nextLine());

        int y = x + Integer.parseInt("88");
        System.out.println(y);

        System.out.println(x);

        String s2 = sc.nextLine();
        System.out.println(s2);
    }
}
