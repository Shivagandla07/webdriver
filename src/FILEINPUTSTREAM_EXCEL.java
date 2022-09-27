import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FILEINPUTSTREAM_EXCEL {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("D:/book1.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(fi);
		XSSFSheet WS = WB.getSheet("exams");
		XSSFRow ROW =WS.getRow(0);
		int rc = WS.getLastRowNum();
		int cc= ROW.getLastCellNum();
		System.err.println("no of rows are::"+rc+"    "+" no of cells::"+cc);
		WB.close();
		fi.close();
		
		

	}

}
