import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class specificelldata_fileinputstream {

	public static void main(String[] args) throws Throwable {
	FileInputStream fi=new FileInputStream("D:/book1.xlsx");
	//get work book from file
	XSSFWorkbook wb =new XSSFWorkbook(fi);
	//get work sheet from work book
	XSSFSheet ws =wb.getSheet("exams");
	//get first row from any sheet
	XSSFRow row = ws.getRow(7);
	//get cell first 
	XSSFCell c1=row.getCell(0);
	//get second cell 
	XSSFCell c2=row .getCell(1);
	String name=c1.getStringCellValue();
	String rest=c2.getStringCellValue();
	System.out.println(name+"    "+rest);
	fi.close();
	wb.close();
	

	}

}
