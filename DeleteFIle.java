import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\student\\Documents\\javaprogram";
        File file = new File(directoryPath, "data.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + file.getAbsolutePath());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
