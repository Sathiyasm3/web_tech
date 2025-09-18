import java.io.File;
import java.util.Scanner;

public class ListDirectoryContents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String dirPath = scanner.nextLine();

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Contents of " + dirPath + ":");
            File[] filesList = directory.listFiles();

            if (filesList != null) {
                for (File file : filesList) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR]  " + file.getName());
                    } else {
                        System.out.println("[FILE] " + file.getName());
                    }
                }
            } else {
                System.out.println("Could not retrieve contents.");
            }
        } else {
            System.out.println("Invalid directory path!");
        }

        scanner.close();
    }
}
