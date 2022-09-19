package Nedelja4.Petak;

public class SuperKnjiga extends Knjiga {

    private int ISBN;

    public SuperKnjiga(String naslov, String author, double ocena, int isbn) {
        super(naslov, author, ocena);
        this.ISBN = isbn;
    }

    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    @Override
    public  String toString(){
        return super.toString() + "\n " + ISBN;
    }


}
