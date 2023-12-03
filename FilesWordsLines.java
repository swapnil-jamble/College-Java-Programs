/*
Write a program to accept a file name from command prompt, if
the file exits then display number of words and lines in that file.
 */

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FilesWordsLines {

    public static void main(String[] args) throws IOException {
     //  String words[];
         String txt;
         int lines = 0;
         int len = 0;

        File fp = new File(args[0]);
        if(fp.exists())
        {
            BufferedReader br = new BufferedReader(new FileReader(fp));

            while((txt = br.readLine()) != null)
               {
                    String  words[] = txt.split(" ");
                    lines ++;
                    len = len +words.length;
               }
            System.out.println("No. of words in file :"+len);
            System.out.println("No. of lines in file :"+lines);
        }
        else
            System.out.println("ohhh.. file not exist..");

    }

}

/*
 Filename : Myfiledata.txt

learn with nil
learn world
learn music

 OUTPUT:
PS C:\Users\swapnniljamble\IdeaProjects\MyProject\src> javac FilesWordsLines.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java FilesWordsLines Myfiledata.txt
No. of words in file :7
No. of lines in file :3

 */