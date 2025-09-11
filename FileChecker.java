import java.io.File;
import java.util.Scanner;

public class FileChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file or directory path to check: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The path '" + path + "' does not exist.");
            scanner.close();
            return;
        }

        if (file.isFile()) {
            System.out.println("'" + path + "' is a file.");
        } else if (file.isDirectory()) {
            System.out.println("'" + path + "' is a directory.");
        } else {
            System.out.println("'" + path + "' exists but is neither a file nor a directory.");
        }

        System.out.println("Read permission: " + (file.canRead() ? "Yes" : "No"));
        System.out.println("Write permission: " + (file.canWrite() ? "Yes" : "No"));

        scanner.close();
    }
}
