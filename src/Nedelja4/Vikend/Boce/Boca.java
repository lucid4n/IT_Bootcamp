package Nedelja4.Vikend.Boce;

public class Boca {

    private double zapremina;

    public Boca(double zapremina) {
        this.zapremina = zapremina;
    }

    public Boca(){}

    public double getZapremina() {
        return zapremina;
    }

    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }

    public boolean isEqual(Boca b)  {
        // objekat this nad kojim pozivamo metodu isEqual
        return this.getZapremina() == b.getZapremina();
    }

}
