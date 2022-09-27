
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile_inputstream {

	public static void main(String[] args) throws Throwable {
	//read path excel
		FileInputStream fi =new FileInputStream("D://book1.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		// get sheet from work book
		XSSFSheet ws= wb.getSheet("exams");
		// get row from sheet
		XSSFRow row=ws.getRow(0);
		// count no of rows in sheet 
		int rc = ws.getLastRowNum();
		// count no of cells in first row
		int cc= row.getLastCellNum();
		System.out.println("no of rows are::" +rc+"   "+" no cells are::"+cc);
		fi.close();
		wb.close();
		
		
		
		



		
	}

}
