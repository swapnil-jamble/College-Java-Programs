/*
Define a Item class (item_number, item_name, item_price). Define 
a default and parameterized constructor. Keep a count of objects created. 
Create objects using parameterized constructor and display the object 
count after each object is created.(Use static member and method). Also 
display the contents of each object
 */

    import java.util.Scanner;

    public class ItemClass {
        int item_number;
        String item_name;
        int item_price;

        static int numberofobjects=0;

        ItemClass()
        {
            item_number=0;
            item_name="";
            item_price=0;
        }

        ItemClass(int item_number,String item_name,int item_price)
        {
            this.item_number=item_number;
            this.item_name=item_name;
            this.item_price=item_price;

            numberofobjects++;
        }
        public void display(){
            System.out.println("ItemClass item_number :"+item_number);
            System.out.println("ItemClass item_name: "+item_name);
            System.out.println("ItemClass price: "+item_price);
        }
        public static void main(String[] args){
            int n=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("How many Items you want to enter :");
            n=sc.nextInt();
            ItemClass[] ob = new ItemClass[n];

            for(int i=0;i<n;i++)
            {
                sc= new Scanner(System.in);

                System.out.println("Enter item_number of item "+(i+1)+" :");
                int item_number=sc.nextInt();

                System.out.println("Enter item_name of item "+(i+1)+" :");
                String item_name= sc.next();

                System.out.println("Enter Item price of item "+(i+1)+" :");
                int item_price=sc.nextInt();

                ob[i] = new ItemClass(item_number,item_name,item_price);
                System.out.println("\nNumber of Objects : "+numberofobjects);

            }
            for(int i=0;i<n;i++)
            {
                ob[i].display();
            }
        }
    }

    /*
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac ItemClass.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java ItemClass
How many Items you want to enter :3
Enter item_number of item 1 :
1
Enter item_name of item 1 :
soap
Enter Item price of item 1 :
10

Number of Objects : 1
Enter item_number of item 2 :
2
Enter item_name of item 2 :
pen
Enter Item price of item 2 :
5

Number of Objects : 2
Enter item_number of item 3 :
3
Enter item_name of item 3 :
laptop
Enter Item price of item 3 :
50000

Number of Objects : 3
ItemClass item_number :1
ItemClass item_name: soap
ItemClass price: 10
ItemClass item_number :2
ItemClass item_name: pen
ItemClass price: 5
ItemClass item_number :3
ItemClass item_name: laptop
ItemClass price: 50000

     */