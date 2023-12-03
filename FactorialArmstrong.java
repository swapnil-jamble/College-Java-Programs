/*c] Write a menu driven program to perform the following operation:
        i. Calculate the volume of cylinder (volume:π × r² × h).
        ii. Find the factorial fo the given number.
        iii. Check  number is armstrong or not.
        iv.   Exit.
*/

import java.util.Scanner;
import java.lang.Math;

public class FactorialArmstrong  {



    public static void main(String[] args) {
        int ch;
        int r;
        int h;
        int fact=1;
        int num;
        int last;
        int result=0;
        int len;
        int digits=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1.calculate volume of cylinder:\n2:find factorial \n3:chk armstrong\n4:Exit");
            System.out.println("enter ur choice:");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("enter the  radius and height:");
                    r = sc.nextInt();
                    h = sc.nextInt();
                    System.out.println("volume of cylindr is:" + 3.14 * r * r * h);
                    break;
                case 2:
                    System.out.println("enter the number:");
                    num = sc.nextInt();
                  int temp = num;
                    while (temp > 0) {
                        fact = fact * temp;
                        temp--;
                    }
                    System.out.println("factorial of "+num+" is:"+fact);
                    fact =1;
                    break;
                case 3:
                    System.out.println("Enter the number:");    //153
                    num = sc.nextInt();
                    temp=num;
                    while(temp>0)
                    {
                        temp=temp/10;
                        digits ++;
                    }
                    temp = num;
                    while(temp>0)
                    {
                        last = temp%10;
                        result += (Math.pow(last, digits));
                        temp=temp/10;
                    }
                    if(num==result)
                        System.out.println(num+" is armstrong number..");
                    else
                        System.out.println(num+" is not armstrong number..");
                    result =0;
                    last =0;
                    temp=0;
                    digits=0;

                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid case!!!");
            }

            }while(ch!=4);
        }
    }

    /* output:

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
1
enter the  radius and height:
1
2
volume of cylindr is:6.28

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
2
enter the number:
3
factorial of 3 is:6

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
2
enter the number:
4
factorial of 4 is:24

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
2
enter the number:
5
factorial of 5 is:120

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
3
Enter the number:
33
33 is not armstrong number..

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
3
Enter the number:
3
3 is armstrong number..

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
3
Enter the number:
2
2 is armstrong number..

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
3
Enter the number:
153
153 is armstrong number..

1.calculate volume of cylinder:
2:find factorial
3:chk armstrong
4:Exit
enter ur choice:
4
Exit

     */
