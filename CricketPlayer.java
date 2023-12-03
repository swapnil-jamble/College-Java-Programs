/*
Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .
Calculate the batting average for each player using static method avg().
Define a static sort method which sorts the array on the basis of average.
Display the player details in sorted order.

 */

import java.util.Scanner;

public class CricketPlayer {
    String name;
    int no_of_innings, no_of_times_notout, totalruns;
    float bat_avg;

    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
    }

    static void average(CricketPlayer player[],int n)
    {
        try
        {
             for(int i=0; i<n; i++)
             {
                 player[i].bat_avg = player[i].totalruns/player[i].no_of_innings;
             }
       }
        catch (Exception e)
        {
            System.out.println(e);
        }
     }

     static void sort(CricketPlayer player[], int n)
     {
         for(int i=0; i<n; i++)
         {
             for(int j=i+1;j<n; j++)
             {
                 if(player[i].bat_avg > player[j].bat_avg)
                 {
                     CricketPlayer temp = player[i];
                     player[i] = player[j];
                     player[j] = temp;
                 }

             }
         }

     }



     void display(CricketPlayer player[], int n)
     {
         System.out.println("\n Name :"+name+"\tnumber of innings :"+no_of_innings+"\tnumber of times not out :"+no_of_times_notout+"\tTotal runs :"+totalruns+"\tBat average :"+bat_avg);

     }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cricketers:");
        int n = sc.nextInt();

        CricketPlayer player[] = new CricketPlayer[n];

        System.out.println("Enter the cricketer Information:");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the Name of Cricketer :"+(i+1));
            String name = sc.next();
            System.out.println("Enter the Number of innings of Cricketer :"+(i+1));
            int no_of_innings = sc.nextInt();
            System.out.println("Enter the Number of times not out of Cricketer :"+(i+1));
            int no_of_times_notout = sc.nextInt();
            System.out.println("Enter the Total runs of Cricketer :"+(i+1));
            int totalruns = sc.nextInt();

            player[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, totalruns);

        }
        CricketPlayer.average(player,n);
        CricketPlayer.sort(player,n);

        System.out.println("Afer Sorting Cricketers on the basis of their Averages:");
        for(int i=0; i<n; i++)
        {
            player[i].display(player,n);

        }
    }
}

/* OUTPUT:
Enter the numebr of Cricketers:
3

Enter the cricketer Information:
Enter the Name of Cricketer :1
a
Enter the Number of innings of Cricketer :1
13
Enter the Number of times not out of Cricketer :1
10
Enter the Total runs of Cricketer :1
100

Enter the Name of Cricketer :2
b
Enter the Number of innings of Cricketer :2
8
Enter the Number of times not out of Cricketer :2
5
Enter the Total runs of Cricketer :2
20

Enter the Name of Cricketer :3
c
Enter the Number of innings of Cricketer :3
15
Enter the Number of times not out of Cricketer :3
14
Enter the Total runs of Cricketer :3
4000

Afer Sorting Cricketers on the basis of their Averages:

 Name :b	number of innings :8	number of times not out :5	Total runs :20	Bat average :2.0

 Name :a	number of innings :13	number of times not out :10	Total runs :100	Bat average :7.0

 Name :c	number of innings :15	number of times not out :14	Total runs :4000	Bat average :266.0


 */