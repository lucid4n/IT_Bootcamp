package Nedelja5.Ponedeljak;

import java.util.ArrayList;
import java.util.Scanner;

public class KombinacijaZnakova {

    private int velicina;
    private ArrayList<String> kombinacija;
    // Конструктор који прима величину
    public KombinacijaZnakova(int velicina) {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију
    public void setKombinacija(ArrayList<String> kombinacija) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x ".repeat(velicina));
        kombinacija = new ArrayList<>();

        for (int i = 0; i < velicina; i++)
        {
            kombinacija.add(sc.next());
        }

        for(var znak : kombinacija){

            if (Znakovi.dozvoljeniZnakovi.contains(znak)){

            }
        }

    }








    // void setRandom за комбинацију

    // boolean equals - Override

    // void porediKombinacije(KombinacijaZnakova kz)
    // broj pogodjenih ali na pogresnom mestu
    // ☻ ☻ ☻ ☺
}


