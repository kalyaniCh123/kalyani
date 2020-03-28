package cts.selenium.kallu;

public class ReadExcelData {

	public static <ExcelDataConfig> void main(String[] args) {
			// TODO Auto-generated method stub
			ExcelDataConfig excel=new ExcelDataConfig("F:\\\\sumi\\\\sample-java-project\\\\src\\\\test\\\\resources\\\\XLSX\\\\TestData.xlsx");
			System.out.println(((Object) excel).getData(0, 0, 0));
			System.out.println(excel.getData(0, 0, 1));
			
	}

}
