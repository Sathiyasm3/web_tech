import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class analyse_text_file {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try(BufferedReader br= new BufferedReader(new FileReader(filename))){
            String line;

            while((line = br.readLine()) != null){
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if(words.length == 1 && words[0].isEmpty()){
                    continue;
                }
                wordCount += words.length;
            }

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        }catch(IOException e){
            System.err.println("IOException: " + e.getMessage());
        }

        scanner.close();
    }
}
