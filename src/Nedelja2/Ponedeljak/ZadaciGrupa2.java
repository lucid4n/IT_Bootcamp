package Nedelja2.Ponedeljak;

import java.util.Scanner;

public class ZadaciGrupa2 {
    // printMultiple
    // repeat

    // a = 5 b = 4        a = 2 b = 6
    //
    //     #####              ##
    //     #####              ##
    //     #####              ##
    //     #####              ##
    //                        ##
    //                        ##
//1. Написати функцију која исписује прослеђени String, N пута у новом реду (String и број се прослеђују)
//     - Нпр  printMultiple("12a", 3) ->
//                 12a
//                 12a
//                 12a
//     -      printMultiple("134", 0) ->
//
// 2. Написати функцију која враћа String поновљен N пута
//     - Нпр  repeat("x12y", 2) -> "x12yx12y"
//         -      repeat("12", 4) -> "12121212"
//         -      repeat("1564", 0) -> ""

    public static String repeat(String str, int n){
        String res = "";

        for(int i = 0; i < n; i++){
            res += str;
        }

        return res;
    }

    public static void printMultiple(String str, int n){
        for(int i = 0; i < n; i++){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String row = repeat("#", a); // ##### -> Ако је а = 5

        printMultiple(row, b);
    }
}