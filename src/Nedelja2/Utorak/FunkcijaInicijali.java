package Nedelja2.Utorak;

//
// ```
// initials("Pera", "Simic"); -> PS
// initials("Zika", "Peric"); -> ZP
// ```

public class FunkcijaInicijali {

    public static String initials (String firstName, String lastName){
        return "" + firstName.charAt(0) + lastName.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(initials("MajkaDevet", "Jugovica"));
    }
}
