package Nedelja4.Vikend.Boce;

import Nedelja4.Vikend.Boce.Boca;

public class VinskaBoca extends Boca {

    private String nazivVina;

    public VinskaBoca(double zapremina, String nazivVina) {
        super(zapremina);
        this.nazivVina = nazivVina;
    }

    public VinskaBoca(String nazivVina) {
        this.nazivVina = nazivVina;
    }

    public String getNazivVina() {
        return nazivVina;
    }

    public void setNazivVina(String nazivVina) {
        this.nazivVina = nazivVina;
    }



}
