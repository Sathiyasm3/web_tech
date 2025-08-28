import java.io.FileWriter;
import java.io.IOException;

public class ai{
	public static void main(String[] args){
		String data=".  This is appended text.";
		try(FileWriter writer=new FileWriter("mydata.txt",true)){
			writer.write(data);
			System.out.println("text appended successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}