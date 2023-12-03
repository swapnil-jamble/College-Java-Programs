/*
Write a program to accept ‘n’ name of cities from the user and sort
them in ascending order
 */

/*

import java.util.Scanner;
public class SortCity {
    String cname;
    SortCity(String cname)
    {
        this.cname = cname;
    }

    static void sort(SortCity city[] , int n)
    {
        for(int i=0; i<n; i++ )
        {
            for(int j=i+1; j<n; j++)
            {
                if((city[i].compareTo(city[j])) < 0 )
                {
                    SortCity temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of cities:");
        int n = sc.nextInt();

        SortCity city[] = new SortCity[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of City :"+(i+1));
            String cname = sc.next();

            city[i] = new SortCity(cname);
        }
       SortCity.sort(city,n);

        System.out.println("Displaying cities After sorting :");
        for(int i=0; i<n; i++)
        {
            System.out.println(city[i]);
        }

    }
}

*/





class SortCity
{
    public static void main(String arg[])
    {

        String name[]=new String[10];
        int l=arg.length;
        String temp;
        for(int i=0;i<l;i++)
        {
            name[i]=arg[i];
        }
        for(int j=0;j<l;j++)
        {
            for(int k=j+1;k<l;k++)
            {
                if((name[j].compareTo(name[k]))<0)
                {
                    temp=name[j];
                    name[j]=name[k];
                    name[k]=temp;
                }
            }
        }
        System.out.println("Sorted City Are-");
        for(int i=0;i<l;i++)
        {
            System.out.println(name[i]);
        }
    }
}