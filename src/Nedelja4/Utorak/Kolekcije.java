package Nedelja4.Utorak;

import java.util.*;

public class Kolekcije {
    // Array
    // ArrayList
    // LinkedList
    // Приступ елементу на позицији
    // Брисање елемента са позиције
    // Додавање елемента на крај
    // Додавање елемента на почетак
    // Stack
    // Set
    // Map

    public static void skupovi() {
        Set<String> skup = new HashSet<>();
        Set<String> skup2 = new TreeSet<>();

        skup.add("Saul1");
        skup.add("Saul2");
        skup.add("Saul3");
        skup.add("Saul4");
        skup.add("Saul5");

//        Scanner sc = new Scanner(System.in);
//        String n = sc.nextLine();
//        skup.add(n);

        for (var el : skup){
            System.out.println("");
        }

        System.out.println(Arrays.toString(skup.toArray()));
    }

    public static void mape () {
        // K -> V
        // HashMap
        // TreeMap za sortiranje

        HashMap <String, String> config = new HashMap<> ();
        HashMap <Integer, String> postanskiBroj = new HashMap<> ();

        config.put("URL", "itbootcamp.rs");
        config.put("Registracija", "/registration");
        //Za DataBase connection mogu biti dugacke vrednosti

        config.get("URL");


        postanskiBroj.put(11000, "Beograd");
        postanskiBroj.put(18000, "Nis");


        System.out.println(postanskiBroj.get(11000));
    }

    public static void main(String[] args)
        {
            mape();
    }
}
