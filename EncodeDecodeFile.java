import java.io.*;

public class EncodeDecodeFile {
    public static void main(String[] args) {
        String filename = "example.txt";
        String text = "Hello, world! こんにちは 你好 ¡Hola!";
        String encoding = "UTF-8";

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), encoding)) {
            writer.write(text);
            System.out.println("Text written to file with encoding: " + encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename), encoding);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            System.out.println("Reading text back from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
