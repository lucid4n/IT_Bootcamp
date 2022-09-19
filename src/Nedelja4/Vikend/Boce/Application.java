package Nedelja4.Vikend.Boce;

import Nedelja4.Vikend.Boce.Boca;
import Nedelja4.Vikend.Boce.RonilackaBoca;
import Nedelja4.Vikend.Boce.VinskaBoca;

public class Application {
    public static void main(String[] args) {
        var boca1 = new Boca(99);
        var boca2 = new VinskaBoca(99, "Бермет");
        var boca3 = new RonilackaBoca(99, 1000);

        if(boca1.isEqual(boca3)) {
            System.out.println("Запремина боце и ронилачке боце су једнаке");
        }else
            System.out.println("Боце нису једнаке");
        }
        }

