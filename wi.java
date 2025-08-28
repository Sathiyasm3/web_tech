import java.io.FileWriter;
import java.io.IOException;

public class wi{
	public static void main(String[] args){
		String data="Hello!, Java Streams";
		try(FileWriter writer=new FileWriter("mydata.txt")){
			writer.write(data);
			System.out.println("File created successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}