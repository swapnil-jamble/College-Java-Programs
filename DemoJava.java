public class DemoJava {



      public static void main(String args[]) {
          // reverse the string without using reverse function (inbuilt function).
          //method 1:
          // StringBuilder str = new StringBuilder("swpanil");
          //    System.out.println(str.reverse());
//          String str = "swapnil";
//          char ch[] = str.toCharArray();
//          for(int i=ch.length-1; i>=0;i--)
//          System.out.println(ch.length);
//        method 2:
//          String str = "swapnil";
//          StringBuilder sb = new StringBuilder();
//          sb.append(str);
//          System.out.println("the reverse string is :"+sb.reverse());

//      swap numbers
//          int a=33;
//          int b=34;
//          a = a+b;
//          b = a-b;
//          a = a-b;
//          System.out.println("a:"+a+" b:"+b);

          //write the java program to check whether the given string or number is palindrome or not
//
//          int num =567;
//          int temp = num;
//          int rem=0,rev=0;
//          while(temp>0)
//          {
//              rem = temp%10;
//              rev = rev * 10 + rem;
//              temp/= 10;
//          }
//          System.out.println("the reverse number is :"+rev);
//          if(rev == num)
//              System.out.println("the given number is palindrome");
//          else
//              System.out.println("the given number is not palindrome");

          // write the java program for fibonacii series

//          int n1 = 0;
//          int n2 = 1;
//          int n3;
//          System.out.println("how many number fibonacii series u want to print:");
//          java.util.Scanner sc = new java.util.Scanner(System.in);
//          int n = sc.nextInt();
//          for(int i=0; i<n/3;i++)
//          {
//              System.out.println(n1);
//              System.out.println(n2);
//              n3 = n1+n2;
//              System.out.println(n3);
//              n1 = n2+n3;
//              n2 = n1+n3;
//
//          }





//          // write the java program for array sorting
//          int []a = {3,7,4,2,77,44,1};
//          System.out.println("Original Array:");
//          for (int i=0;i<a.length;i++)
//               System.out.println(a[i]);
//
//          System.out.println("Sorting Array:");
//          for(int i=1;i<a.length;i++)
//          {
//              for (int j=0; j<i; j++)
//              {
//                  if(a[i]<a[j])
//                  {
//                      int temp = a[i];
//                      a[i] = a[j];
//                      a[j] = temp;
//                  }
//              }
//          }
//
//          for (int i=0;i<a.length;i++)
//              System.out.println(a[i]);
//      }
//    }

         // fibonacii series using recursion
        //  DemoJava.fibRecursion(0,1,1);

           




      }

    // fibonacii series using recursion
//    static void fibRecursion ( int n1, int n2,int l)
//    {
//        if (l != 10) {
//            System.out.println(n1);
//            System.out.println(n2);
//            int n3 = n1 + n2;
//            System.out.println(n3);
//            n1 = n2 + n3;
//            n2 = n1 + n3;
//
//            fibRecursion(n1, n2, ++l);
//        }
//
//    }
}