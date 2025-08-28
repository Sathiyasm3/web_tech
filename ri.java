import java.io.FileReader;
import java.io.IOException;

public class ri{
	public static void main(String[] args){
		try(FileReader reader=new FileReader("mydata.txt")){
			int ch;
			while((ch=reader.read())!=-1){
				System.out.print((char)ch);
		}
		System.out.println("\n File read successfully");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}