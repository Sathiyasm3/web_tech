import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class copy {
    public static void main(String[] args){
        String source = "mydata.txt";
        String destination = "yourdata.txt";
	String info="\t This is copied file";

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));
        ) {
            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
           }
	    
	   byte[] infobytes=info.getBytes(StandardCharsets.UTF_8);
	   bos.write(infobytes);	
	    
            System.out.println("File copied successfully.");
	}catch (IOException e) {
            System.out.println("Error has occurred: " + e.getMessage());
        }
    }
}
