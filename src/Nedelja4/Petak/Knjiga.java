package Nedelja4.Petak;

public class Knjiga {

    private String naslov;
    private String author;
    private double ocena;

    // Konstruktor
    public Knjiga(String naslov, String author, double ocena)
    {
        this.naslov = naslov;
        this.author = author;
        this.ocena = ocena;
    }

    // Prazan konstruktor

    Knjiga (){

    }

    // Metode

    public String getNaslov(){
        return this.naslov;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getOcena(){
        return this.ocena;
    }

    // toString metoda za ispisivanje Stringa

    @Override // Sa ovim se ubrzava Java (compiler)
    public String toString(){
        return " Knjiga " + getNaslov() + "\n Ocena " + getOcena() + " \n Author " + getAuthor();
    }


}
