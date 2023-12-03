import java.io.*;

public class FileSearch {
    public static void main(String[] args) throws FileNotFoundException {

    //  File f = new File("C:\Users\jambl\IdeaProjects\MyProject\src\searchFile.txt");
      //  FileInputStream fis = new FileInputStream(f);

      File f = new File("searchFile.txt");
        //System.out.println(f.getAbsolutePath());
         FileReader fr = new FileReader(f);
        System.out.println();
    }
}
