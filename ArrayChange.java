
import java.util.Scanner;

public class ArrayChange {

    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);

        int i, j;
        System.out.println("Enter total rows and columns: ");
        int row = s.nextInt();
        int column = s.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter matrix Value:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                array[i][j] = s.nextInt();
            }
        }

        System.out.println("The above matrix value before Changing ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix value after changing ");
        for(i = 0; i < column; i++)
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }

}

/* OUTPUT:
Enter total rows and columns:
2
3
Enter matrix Value:
2 3 4
5 6 7
The above matrix value before Changing
2 3 4
5 6 7
The above matrix value after changing
2 5
3 6
4 7
 */