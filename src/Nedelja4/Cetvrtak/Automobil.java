package Nedelja4.Cetvrtak;

public class Automobil {
    //atributi
    String marka;
    String model;
    int godinaProizvodnje;
    int registracija;

    //metode
    public void upali(){
        System.out.println("BRMMMM");
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }
    //    ugasi();
//    krani();
//    stani();
}

