package Nedelja4.Cetvrtak;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

//        Automobil a1 = new Automobil();
//        Automobil a2 = new Automobil();
//        Automobil a3 = new Automobil();
//        System.out.println(a3.marka);
//        a1.model = "ABC";
//        a1.godinaProizvodnje = 1994;
//        a1.registracija = 2005;
//        a1.marka = "BMM";
//
//        a2.model = "CCC";
//        a2.marka = "UPS";
//
//        System.out.println(a1.model + " " + a1.marka);
//        System.out.println(a2.model + " " + a2.marka);
//
//        a1.upali();
//        a2.upali();
//        System.out.println(a1.godinaProizvodnje);
//        System.out.println(a1.getGodinaProizvodnje());
//        a1.setGodinaProizvodnje(2000);
//        System.out.println(a1.getGodinaProizvodnje());

        Osoba a1 = new Osoba();
        Osoba a2 = new Osoba();
        Osoba a3 = new Osoba();

        a1.setIme("Petar");
        a2.setIme("Mitar");
        a3.setIme("Lalo");

        a1.setPrezime("Petrovic");
        a2.setPrezime("Petrovic");
        a3.setPrezime("Petrovic");

        a1.setGodine(99);
        a2.setGodine(35);
        a3.setGodine(52);

        a1.setPol('Z');
        a2.setPol('M');
        a3.setPol('Z');

        System.out.println(a1.ime + " " + a1.prezime);
        System.out.println(a2.godine + " " + a2.pol + " ");
        System.out.println(a1.toString());


        Osoba os = new Osoba ("Vojvoda", "Vojvoda", 1932, 'Z');
        System.out.println(os.toString());

    }


}
