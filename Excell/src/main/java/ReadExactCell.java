import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

public class ReadExactCell {
    public static void main(String[] args) throws Exception {
        // Load Excel file
        Workbook wb = new Workbook("D:\\employment.xlsx");

// Get all worksheets
        WorksheetCollection collection = wb.getWorksheets();

            // Get worksheet using its index
            Worksheet worksheet = collection.get(0);

            // Print worksheet name
            System.out.println("Worksheet: " + worksheet.getName());

            System.out.println(worksheet.getCells().get(1, 2).getValue());

            }
}



