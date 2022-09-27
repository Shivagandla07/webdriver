import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Filehandling {

	public static void main(String[] args) throws Throwable{
	File f = new File("D:\\shiva.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter br= new BufferedWriter(fw);
	br.write("pulsar220");
	br.newLine();
	br.newLine();
	br.write("gfsjfv");
	br.newLine();
	
	br.flush();
	br.close();

	}

}
