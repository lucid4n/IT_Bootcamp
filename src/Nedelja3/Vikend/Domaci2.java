/*
package Nedelja3.Vikend;

public class Domaci2 {

    public static void printMatrix (int [][] matrix){

        for (int i = 0; j < matrix[0].length; i++){
            System.out.println(matrix[i][j] + " ");
        }
        System.out.println();
    }

    public static int [][] Max(int [][] matrix)
    {
        int maxColumnValue = Integer.MAX_VALUE;
        int maxColumnIndex = -1;
        int columnValue = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            columnValue = 0;
            for (int j = 0; j< matrix.length; j++)
            {
                columnValue += matrix[j][i];

                if (columnValue > maxColumnValue){
                    maxColumnIndex = i;
                    maxColumnValue = columnValue;
                }
            }
        }

        int [] noviNiz = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++)
        {
            noviNiz [i] = matrix [i] [maxColumnIndex];
        }
        
        for (int i = maxColumnIndex; i>0; i++)
        {
            matrix[j][i] = matrix [j][i-1];
        }

    
    for (int i = 0; i <matrix.length; i++) {
        matrix[i][0] = noviNiz[i];
    }


    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1, 7},
                {9, 11, 5, 4},
                {6, 0, 13, 17},
                {7, 21, 14, 15}};

        int[][] finalMatrix = new int[matrix.length][matrix[0].length];
        finalMatrix = Max(matrix);

        printMatrix(finalMatrix);
    }}*/
