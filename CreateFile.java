import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\student\\Documents\\javaprogram";
        File file = new File(directoryPath, "data.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
