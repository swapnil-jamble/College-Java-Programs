
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Menu;
import java.awt.Frame;
public class MenubarClass {

    MenubarClass()
    {
        Frame f = new Frame("MyMenubar");
        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");
        Menu tool = new Menu("Tool");
        Menu about = new Menu("About");

        MenuItem fnew = new MenuItem("New");
        MenuItem fopen = new MenuItem("Open");
        MenuItem fsave = new MenuItem("Save");
        MenuItem fshow = new MenuItem("Show About");
        MenuItem fexit = new MenuItem("Exit");

        mb.add(file);
        mb.add(tool);
        mb.add(about);

        file.add(fnew);
        file.add(fopen);
        file.add(fsave);
        file.add(fshow);
        file.add(fexit);

        f.setMenuBar(mb);
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        MenubarClass obj = new MenubarClass();
    }
}
