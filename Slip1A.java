//1. Write a Java program to display all the alphabets between ‘A’ to ‘Z’ after every 2
//seconds.

 class Alphabet extends Thread
 {
     public void run()
     {
         try
         {
             System.out.println("First Method:");
             for(int i=65; i<=90; i++)
             {
                 System.out.printf("%c\t",i);
                 Thread.sleep(100);
             }
             //Or
             System.out.println("\nSecond Method:\n");
             char ch;
             for(ch = 'A'; ch<='Z'; ch++)
             {
                 System.out.print(ch+"  ");
                 Thread.sleep(10);
             }
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
     }
 }

public class Slip1A {
    public static void main(String[] args) {
        Alphabet t = new Alphabet();
        t.start();

    }
}


/*
OUTPUT:
First Method:
A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
Second Method:
A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z

 */