package Nedelja2.Ponedeljak;

// 1. Написати функцију која враћа мањи од 2 броја (без Math.min)
// 2. Написати функцију која враћа мањи од 3 броја

import java.util.Scanner;

public class ZadaciGrupa1 {

    public static int min2 (int num1, int num2)
    {
        if (num1 < num2){
            return num1; // Мора бити истог типа као и повратна вредност функције
        }
            return num2;
    }

    public static void printMin2 (int x, int y) {
        if (x < y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }

    public static int min3(int a, int b, int c){
//        int minAB = min2(a, b);
//        int minABC = min2(minAB, c);
//
//        return minABC;


        return min2(min2(a, b), c);
    }

// 3. Написати функцију која враћа збир бројева од N до M (N и M се прослеђују)
//    Написати ................................ између N и M

    public static int zbirNM (int n, int m){
        int zbir = 0;

        if(n > m){
            int tmp = n;
            n = m;
            m = tmp;
        }

        for(int i = n; i < m; i++){
            zbir += i;
        }

        return zbir;
    }

    // 4. Написати функцију која враћа n-ти степен броја (прослеђују се број па степен)
    public static int stepen (int x, int n){

//        int res = x;
        int res = 1;

//        for(int i = 0; i < (n-1); i++){
        for(int i = 0; i < n; i++){
            res *= x;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(min2(x, y));

        printMin2(x, y);

        Scanner stepen = new Scanner (System.in);
        x = stepen.nextInt();
        int n = stepen.nextInt();
        System.out.println(stepen(x,n));
    }
}
