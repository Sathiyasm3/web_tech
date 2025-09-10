import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class uptolow {

    public static void convertToUppercase(String inputFile, String outputFile) {
        try (
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile)
        ) {
            int byteData;

            while ((byteData = fis.read()) != -1) {
                // Convert lowercase ASCII letters to uppercase
                if (byteData >= 'a' && byteData <= 'z') {
                    byteData = byteData - ('a' - 'A');
                }
                fos.write(byteData);
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        convertToUppercase(inputFile, outputFile);
    }
}
