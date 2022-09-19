package Nedelja2.Utorak;

import java.util.Scanner;

public class Niske {
    // Дужина String-a
    // Да ли ниска садржи неки карактер (или другу ниску)
    // Позиција неког карактера
    // Извучемо карактер са одређене позиције

    public static void main(String[] args) {
        String s1 = "sjgdkf";
        String s2 = "";

        System.out.println(s1.length());
        System.out.println(s2.length());

        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        // System.out.println(email.contains("@"));
        // System.out.println(email.indexOf("@"));
        //
        // if(!email.isEmpty())
        //     System.out.println(email.charAt(5));
        // else
        //     System.out.println("Ne moze");

        ///////////////////////////
        boolean contains = false; // Још увек не знамо да ли садржи

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                contains = true;
                break;
            }
        }
        System.out.println(contains);

        /////////////////////
        int index = -1; // Позиција пронађеног елемента (ако га пронађе)
        // -1 Означава да није пронашао ниједан елемент на -1 позицији,
        // што нама и одговара

        String allIndexes = "";

        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                allIndexes += i + "  ";
                // index = i;
                // break;
            }
        }

        System.out.println(allIndexes);
    }




}

