import java.io.*;

public class Fileread_Filehandling {

	public static void main(String[] args) throws Throwable {
		File f =new File("D:\\shiva.txt");
     FileReader fr= new FileReader(f);
		BufferedReader Br =new BufferedReader(fr);
		String str="";
		while((str=Br.readLine())!=null) {
			Thread.sleep(4000);
			System.out.println(str);
			
		}

	}

}
