package Nedelja2.Ponedeljak;

public class FizzBuzz {
    // 1 - N
    // Ако је број дељив са 3 исписати Fizz
    // Ако је број дељив са 5 исписати Buzz
    // Ако је дељив и са 3 и са 5 исписати FizzBuzz
    // Ако није дељив ни са чим, исписати сам број
    // Ако је дељив са 7 исписати Zazz

    // 1 2 Fizz 4 Buzz Fizz ... FizzBuzz (15)
    public static void main(String[] args) {
        for(int i = 1; i <= 500; i++){
            // if(i % 3 == 0 && i % 5 == 0){
            //     System.out.println("FizzBuzz");
            // }
            // else if(i % 3 == 0){
            //     System.out.println("FizzZazz");
            // }
            // else if(i % 5 == 0){
            //     System.out.println("Buzz");
            // }
            // else{
            //     System.out.println(i);
            // }
            String res = "";
            // if(i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
            //     System.out.print(i);
            // }
            if(i % 3 == 0){
                res += "Fizz";
            }
            if(i % 5 == 0){
                res += "Buzz";
            }
            if(i % 7 == 0){
                res += "Zazz";
            }

            if(res.equals("")){
                res += i;
            }

            System.out.println(res);
        }
    }
}
