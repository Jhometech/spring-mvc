package in.javahome.springmvc.view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class StudentExcelView extends AbstractXlsView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// get the data
		Map<String, String> data = (Map<String, String>) model.get("stdList");
		// prepare excel sheet and return
		Sheet sheet = workbook.createSheet("javahome");
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Student Name");
		header.createCell(1).setCellValue("Phone");
		Set<Entry<String, String>> set = data.entrySet();
		int rowCount =1;
		for (Entry<String, String> entry : set) {
				Row row = sheet.createRow(rowCount++);
				row.createCell(0).setCellValue(entry.getKey());
				row.createCell(1).setCellValue(entry.getValue());
	    }
		
	}

	

}
