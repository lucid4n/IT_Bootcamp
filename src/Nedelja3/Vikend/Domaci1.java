package Nedelja3.Vikend;

import java.util.ArrayList;

public class Domaci1 {

    public static int N;

    static ArrayList<Integer> colMaxSum(int mat[][])
    {
        int index = -1;

        int maxSum = Integer.MIN_VALUE;

        // Пролазак кроз редове матрице

        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = 0; j < N; j++)
            {
                sum += mat[i][j];
            }

            // Update maxSum ако је мањи од тренутног збира реда

            if (maxSum < sum)
            {
                maxSum = sum;

                // store index
                index = i;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(index);
        res.add(maxSum);

        return res;
    }


    public static void main(String[] args)
    {
        N = 4;
        int[][] mat = {
                { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 },

        };
        ArrayList<Integer> ans = colMaxSum(mat);
        System.out.println("Red "+ (ans.get(0)+1)+ " има највећу вредност у збиру " + ans.get(1));
    }
}


