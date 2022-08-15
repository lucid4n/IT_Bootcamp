package Nedelja3.Sreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
    public static int counter(ArrayList<String> list) {
        int counter = 0;


        for (String i : list) {
            if ((i.length()) >= 2)
                if (i.charAt(0) == i.charAt(i.length()-1)) {
                    counter++;
                }
        }

        return counter;}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> lista = new ArrayList<String>();

        while (true){

            System.out.println("Унесите стринг који желите да убаците у листу (за престанак унесите 0): ");
            String x = sc.nextLine();
            if (x.equals(String.valueOf(0)))
                break;
            lista.add(x);

        }
        System.out.println(lista);
        System.out.println(counter(lista));
    }
}

