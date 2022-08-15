package Nedelja3.Vikend;

public class Domaci3 {
    public boolean validParen(String input) {

        if(input.isEmpty()) {
            return true;
        }

        else {
            for (int i = 0; i < input.length() - 1; i++) {
                if ((input.charAt(i) == '(' && input.charAt(i + 1) == ')') ||
                        (input.charAt(i) == '{' && input.charAt(i + 1) == '}') ||
                        (input.charAt(i) == '[' && input.charAt(i + 1) == ']')) {
                    input = input.substring(0, i) + input.substring(i + 2);
                    System.out.println("Input is: " + input);
                    validParen(input);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Domaci3 sol = new Domaci3();
        System.out.println(sol.validParen(""));
        System.out.println(sol.validParen("()()()")); // returns false for some reason
        System.out.println(sol.validParen("((()()))"));
    }
}


