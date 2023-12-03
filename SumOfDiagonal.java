//Write a program to accept the two dimensional array from user and
//display sum of its diagonal elements.

import java.util.Scanner;

public class SumOfDiagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter the matrix:");
        for(int i=0; i<arr.length; i++)
            {
                for(int j=0; j<arr.length; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

        int sum = 0;
        for(int i=0; i<arr.length; i++)
            {
                for(int j=0; j<arr.length; j++)
                {
                    if(i==j)
                      sum = sum + arr[i][j];
                }
            }
        System.out.println("The sum of diagonal element is:"+sum);

    }
}
