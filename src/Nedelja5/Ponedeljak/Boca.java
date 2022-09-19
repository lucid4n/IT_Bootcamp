package Nedelja5.Ponedeljak;

public class Boca {
    private double zapremina;

    public Boca(double zapremina) {
        if(zapremina >= 10)
             this.zapremina = zapremina;
        else this.zapremina = 10;
    }

    public double getZapremina() {
        return zapremina;
    }

    public void setZapremina(double zapremina) {
        if (zapremina >= 10){
        this.zapremina = zapremina;
    }}

    public boolean isEqual (Boca b)
    {
        return this.zapremina == b.getZapremina();
    }
}
