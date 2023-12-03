/*Write a java program to accept a String from a user and display each vowel from a
 String after every 3 seconds.
 */

import java.util.Scanner;

public class Vowel3Sec {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println(str.charAt(i));
                Thread.sleep(3000);
            }
        }
    }
}
