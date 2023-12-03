/*
Accept the names of two files and copy the contents of the first to
the second. First file having Book name and Author name in file
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) throws IOException
    {

        String str;

        //  File f1 = new File("firstfile.txt");
       // File f2 = new File("secondfile.txt");

        FileReader file1 = new FileReader("firstfile.txt");
        FileWriter file2 = new FileWriter("secondfile.txt");

        BufferedReader br = new BufferedReader(file1);

        while(( str = br.readLine()) != null)
        {
            file2.write(str);
        }
        System.out.println("Successfully copy content from  first file to second file..");



    }

}
