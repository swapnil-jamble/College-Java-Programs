import java.util.Scanner;

public class Pract_Ass {

    int rollno;
    String name;
    float per;
    static int count;

    Pract_Ass()
    {

    }


    Pract_Ass(int rollno,String name,float per)
    {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
        count++;
    }

    public String toString()
    {
        return "\nRollno:"+rollno+"\tName:"+name+"\tPercentage:"+per;
    }
    float getper()
    {
        return per;
    }

    public static void sortStudents(Pract_Ass s[] , int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(s[i].getper()<s[j].getper())
                {
                    Pract_Ass temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many object u want to create:");
        int n = sc.nextInt();

        Pract_Ass[] stu = new Pract_Ass[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the student rollno , name , percentage:");
            int rollno = sc.nextInt();
            String name = sc.next();
            float per = sc.nextFloat();

            stu[i] = new Pract_Ass(rollno,name,per);
            Pract_Ass.count++;

        }

        System.out.println("Display student without sorting percentage:");
                for(int i=0; i<n; i++)
                      System.out.println(stu[i]);
        System.out.println("total number of students are:"+count);

        System.out.println("n is"+n);
        Pract_Ass.sortStudents(stu,n);
        System.out.println("Display student with sorting percentage:");
        for(int i=0; i<n; i++)
            System.out.println(stu[i]);




    }
}
