package Nedelja4.Vikend.Televizor;

public class Application {
    public static void main(String[] args) {
        Televizor tv = new Televizor();
        tv.ukljuci();
        tv.pojacajTon();
        tv.smanjiTon();
        tv.pojacajTon();
        tv.programNavise();
        String parametri = tv.ispisiParametre();
        System.out.println(parametri);
    }
}


