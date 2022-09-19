package Nedelja4.Petak;

//Klasa Osoba
//atribute: ime, prezime, godRodjenja, zanimanje
//konstruktori, get/set metode za ove atribute, toString
//Klasa SuperHeroj nasleđuje klasu Osoba, superMoc, superHerojIme
//konstruktori, get/set metode za ove atribute, toString
//napraviti statički blok koji nam ispisuje
// da li je osoba super heroj ili ne  "Osoba je heroj" i "Osoba nema moći"

public class Osoba {

    static {
        System.out.println("Osoba nema moći");
    }

    String ime;
     String prezime;

     int godRodjenja;
    String zanimanje;

    Osoba(){}

    public Osoba(String ime, String prezime, int godRodjenja, String zanimanje) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
        this.zanimanje = zanimanje;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGod(int god) {
        return god;
    }

    public String getZanimanje(String zanimanje) {
        return zanimanje;
    }



    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGod(int god) {
        this.godRodjenja = god;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    @Override
    public String toString() {
        return "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", god=" + godRodjenja +
                ", zanimanje='" + zanimanje;

    }
}
