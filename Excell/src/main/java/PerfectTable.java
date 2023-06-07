import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

import java.io.File;

public class PerfectTable {

    public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook("D:\\employment.xlsx");
        WorksheetCollection collection = wb.getWorksheets();
        for (int WSIndex = 0; WSIndex < collection.getCount(); WSIndex++) {

            Worksheet worksheet = collection.get(WSIndex);

            System.out.print("Worksheet-" + (WSIndex + 1) + ": " + worksheet.getName() + "\n");
            String spaces = "";
            int rows = worksheet.getCells().getMaxDataRow();
            int columns = worksheet.getCells().getMaxDataColumn();
            for (int i = 0; i <= rows; i++) {
                for (int j = 0; j <= columns; j++) {
                    switch (j) {
                        case 0 -> spaces = "     ";
                        case 1 -> spaces = "                                                 ";
                        case 2 -> spaces = "                         ";
                        case 3 -> spaces = "              ";
                        case 4 -> spaces = "                       ";
                        case 5 -> spaces = "             ";
                        default -> System.out.println("Invalid Input!");
                    }
                    String cellValue = null;
                    if (worksheet.getCells().get(i, j).getValue() == null) cellValue = "Null";
                    else {
                        if (j == 3 && i > 0) {
                            cellValue = worksheet.getCells().get(i, j).getValue().toString();
                            cellValue = cellValue.replaceAll("(?s).", "*");
                            //        cellValue = "*".repeat(cellValue.length());

                        } else cellValue = worksheet.getCells().get(i, j).getValue().toString();
                    }
                    spaces = spaces.substring(cellValue.length());
                    System.out.print(cellValue + spaces + "| ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
