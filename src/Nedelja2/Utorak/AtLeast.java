package Nedelja2.Utorak;
//
// ```
// atLeastX("PericaPeric", 'a', 2)
// ```

// Написати функцију која проверава да ли стринг садржи најмање x прослеђених слова

// 1. Изброј колико пута се c налази у str

public class AtLeast {
    public static int countChars(String str, char c){
        int count = 0;

        for(int i = 0; i <= str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;

}

        // 2. Види да ли је тај резултат већи од x
    public static boolean atLeastX(String str, char c, int x){
        int count = countChars(str, c);

        return count >= x;
    }

    public static void main(String[] args) {
        try{
            System.out.println(atLeastX("Pera",'r', 8));
        }
        catch (Exception e){
            System.out.println("Нешто не ваља");
        }
    }

}
