import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\student\\Documents\\javaprogram\\f1.jpg";
	String destFile = "C:\\Users\\student\\Documents\\javaprogram\\cadiallc.jpg";



        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
