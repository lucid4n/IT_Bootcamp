package Nedelja1.Petak;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        // Unosi brojeve (0 - 9) sa tastature, n puta, dok ne unese "stop"
        // Broji koliko je puta korisnik uneo odredjene brojeve
        // Ispisuje broj unetih brojeva
        // 1 : 5
        // 2 : 54
        // ...
        // 0 : 12

        int brojac1 = 0;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Unesi Y/N");
            char ulaz = sc.next().charAt(0);
            if(ulaz == 'Y') {
                brojac1 = brojac1 + 1;
            }
            if(ulaz == 'N'){
                break;
            }
        }
        System.out.println(brojac1);
    }
}

