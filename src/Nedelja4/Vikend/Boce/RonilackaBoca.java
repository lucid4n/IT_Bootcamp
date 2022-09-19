package Nedelja4.Vikend.Boce;

import Nedelja4.Vikend.Boce.Boca;

public class RonilackaBoca extends Boca {

    private double masa;


    public RonilackaBoca(double zapremina, double masa) {
        super(zapremina);
        this.masa = masa;
    }

    public RonilackaBoca(double masa) {
        this.masa = masa;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
}
