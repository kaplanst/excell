import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;

import java.io.File;

public class Test {

        public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook("D:\\employment.xlsx");
        WorksheetCollection collection = wb.getWorksheets();
            for (int WSIndex = 0; WSIndex < collection.getCount(); WSIndex++) {

                Worksheet worksheet = collection.get(WSIndex);

                System.out.print("Worksheet-" + (WSIndex + 1) + ": " + worksheet.getName() + "\n");
                String spaces = "";
                int rows = worksheet.getCells().getMaxDataRow();
                int columns = worksheet.getCells().getMaxDataColumn();
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        switch (j) {
                            case 0:
                                spaces = "     ";
                                break;
                            case 1:
                                spaces = "                                     ";
                                break;
                            case 2:
                                spaces = "                          ";
                                break;
                            case 3:
                                spaces = "                 ";
                                break;
                            case 4:
                                spaces = "                        ";
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }

                        String cellValue = worksheet.getCells().get(i, j).getValue().toString();

                        spaces = spaces.substring(cellValue.length());
                        System.out.print(cellValue + spaces +"| ");
                    }
                    System.out.println();
                }

                System.out.println();

            }

    }



}
