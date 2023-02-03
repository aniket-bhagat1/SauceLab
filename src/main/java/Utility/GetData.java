package Utility;

import java.util.ArrayList;

import org.apache.poi.xssf.XLSBUnsupportedException;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;

public class GetData {

	static XLSBUnsupportedException reader;
	
	public static ArrayList<Object[]> getDataOfRowExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new XLSBUnsupportedException("C:\\Users\\amard\\eclipse-workspace\\SauceLab\\TestData\\dataForRediff.xlsx");
		}
		catch (Exception e) {

		}
		
	}
}
