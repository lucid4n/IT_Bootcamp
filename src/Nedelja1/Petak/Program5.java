package Nedelja1.Petak;

public class Program5 {
    public static void main(String[] args) {


//        for(int i = 1; i<=3;i++){
//            System.out.println("Nedelja " + i);
//            for(int j = 1; j <=7; j++){
//                System.out.println("Dan " + j);
//            }
//        }

        int red = 5;
        for(int i = 1; i<=red;i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.print("\n");
        }

//        int w = 3;
//        int d = 7;
//
//        for(int i = 1; i<=w;i++){
//            System.out.println("Nedelja " + i);
//            for(int j = 1; j <=d; j++){
//                if (i == 2){
//                    break;
//                }
//                System.out.println("Dan " + j);
//            }
//        }

        int w = 3;
        int d = 7;

        for(int i = 1; i<=w;i++){
            System.out.println("Nedelja " + i);
            for(int j = 1; j <=d; j++){
                if (j % 2 != 0){
                    continue;
                }
                System.out.println("Dan " + j);
            }
        }
    }
}

