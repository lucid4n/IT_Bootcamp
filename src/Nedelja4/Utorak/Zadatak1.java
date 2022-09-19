package Nedelja4.Utorak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zadatak1 {
    //Написати функцију која враћа прослеђен низ целих бројева, али без дупликата
    //Напомена: Редослед није важан
    //Помоћ: Функција која тражи да ли се неки елемент налази у низу
    //int[] arr = { 1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8 };
    //removeDuplicates(arr); // Враћа [1, 2, 3, 4, 5, 8, 90]

    public static void main(String[] args) {
        int [] array = { 1, 1, 2, 3, 3, 4, 5, 2, 8, 90, 8 };
        System.out.println(Arrays.toString(removeDuplicate(array)));
    }

    private static int [] removeDuplicate (int[] array)
    {
        Set<Integer> removeDuplicates = new HashSet<>();

        for (int j : array){
            removeDuplicates.add(j);
        }

        return removeDuplicates.stream().mapToInt(Integer::intValue).toArray();
    }
}


