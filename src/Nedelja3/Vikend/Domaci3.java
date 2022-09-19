package Nedelja3.Vikend;

public class Domaci3 {

    public static boolean isValid(String str) {
        boolean isTrue = true;
        int count = 0;

        for (int i = 0; i < str.length(); i++)

            if (str.charAt(i) == '(')
            {
                count++;
            }
            else
            {
                count--;
            }

        if (count < 0)
        {
            isTrue = false;
        }


        if (count != 0)
        {
            isTrue = false;
        }

        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()()()"));
        System.out.println(isValid(")()("));
        System.out.println(isValid("(()(()"));
        System.out.println(isValid("((()()))"));
    }
}


