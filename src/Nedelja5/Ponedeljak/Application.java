package Nedelja5.Ponedeljak;

import Nedelja5.Ponedeljak.Skocko;

public class Application {
    public static void main(String[] args) {
        var igra = new Skocko(); // ...

        while(!igra.jeGotova()){
            igra.pokusaj();
        }
    }
}

