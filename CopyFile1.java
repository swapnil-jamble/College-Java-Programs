/*
Accept the names of two files and copy the contents of the first to
the second. First file having Book name and Author name in file.

 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

    public static void main(String[] args) throws IOException
    {

        FileInputStream in = new FileInputStream(new File("firstfile.txt"));
        FileOutputStream out = new FileOutputStream(new File("secondfile.txt"));

        int l;
        while((l = in.read()) != -1)
        {
            out.write(l);
        }
        System.out.println("Successfully copy content from first file to second file...");
    }
}

/*
File 1 name : firstfile.txt
yes u can do it...
learn with nil..
123456789

File 2 name : secondfile.txt


OUTPUT:
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> javac CopyFile1.java
PS C:\Users\swapniljamble\IdeaProjects\MyProject\src> java CopyFile1
Successfully copy content from first file to second file...

File 1 name : firstfile.txt
yes u can do it...
learn with nil..
123456789

File 2 name : secondfile.txt
yes u can do it...
learn with nil..
123456789

 */