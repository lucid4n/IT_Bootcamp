package Nedelja2.Ponedeljak;

public class Funkcije {
    public static void main(String[] args) {
        double ocena1 = 5;
        int ocena2 = 2;

        double prosek = average(ocena1, ocena2); // Позив функције са параметрима

        System.out.println(prosek); // 3.5
        System.out.println(average(ocena1, ocena2)); // 3.5

        average2(ocena1, ocena2); // 3.5

    }

    // Написати фју која прима два броја и ВРАЋА средњу вредност та два броја
    public static double average(double x, int y){ // Потпис функције
        return (x + y) / 2.0;
    }

    // Написати фју која прима два броја и исписује средњу вредност та два броја
    public static void average2(double x, int y){ // Потпис функције
        System.out.println((x + y) / 2.0);
    }
}

