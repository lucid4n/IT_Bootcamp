package Nedelja4.Petak;

public class SuperHeroj extends Osoba {
    //Klasa SuperHeroj nasleđuje klasu Osoba, superMoc, superHerojIme
    //konstruktori, get/set metode za ove atribute, toString
    static {
        System.out.println("Osoba je heroj");
    }

    String superMoc;
    String superHerojIme;

    SuperHeroj(){

    }

    SuperHeroj(String i, String p, int gR,String z,String ime, String moc){
        super(i,p,gR,z);
        this.superHerojIme = ime;
        this.superMoc = moc;
    }

    public String getSuperHerojIme() {
        return superHerojIme;
    }

    public String getSuperMoc() {
        return superMoc;
    }

    public void setSuperHerojIme(String superHerojIme) {
        this.superHerojIme = superHerojIme;
    }

    public void setSuperMoc(String superMoc) {
        this.superMoc = superMoc;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getSuperHerojIme() + " " +  getSuperMoc();
    }
}

