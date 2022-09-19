package Nedelja4.Utorak;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Zadatak2 {
    public static void main(String[] args) {
       int [] arr = { 1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8 };
        System.out.println(countDupicates(arr));
        System.out.println(occuranceNumber(arr));
    }

    public static int countDupicates(int[] arr){
        Set<Integer> skup = new HashSet<>();
        for (var el : arr){
            skup.add(el);
        }

        int brojDuplikata = arr.length - skup.size();

        return brojDuplikata;
    }

    public static HashMap<Integer, Integer> occuranceNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        Set<Integer> keys = new HashSet<>();

        for (var el : arr) {
            if(!keys.add(el));

            else
            {
                map.put(el, map.get(el) + 1);
            }

        }

        return map;
    }
}
