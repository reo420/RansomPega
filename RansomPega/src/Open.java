import java.awt.Desktop;
import java.io.*;
public class Open {
    public void text() throws IOException {
        {
            try {

                File file = new File(System.getProperty("user.home") + "/Desktop/READMENOW.txt");
                Desktop desktop = Desktop.getDesktop();
                if (file.exists())
                    desktop.open(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}