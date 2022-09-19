package Nedelja4.Petak;

public class Main {
    public static void main(String[] args) {
        Knjiga knjiga = new Knjiga ("Aleksandar Veliki", "Aleksandar Lucic", 9.0);
        System.out.println(knjiga.toString());
        SuperKnjiga knjiga2 = new SuperKnjiga ("Druga Knjiga Aleksandra Velikog", "Aleksandar Lucic", 10, 199);
//      System.out.println(knjiga2.toString());
        System.out.println(knjiga.getOcena());
    }
}
