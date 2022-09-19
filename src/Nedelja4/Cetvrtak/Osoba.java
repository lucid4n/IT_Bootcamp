package Nedelja4.Cetvrtak;

public class Osoba {

    String ime;
    String prezime;
    int godine;
    char pol;


    public Osoba ()
    {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.pol = pol;
    }

    Osoba (String ime, String prezime, int godine, char pol){
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.pol = pol;
    }

    public String getIme() {
        return ime;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;

    }

    public char setPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }
    // public String toString() {
    //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    //    }
    public String toString () {
        return this.ime + " " + prezime + " " + godine + " " + pol + " ";
    }
}

