import java.io.*;

public class FileWork {
    public static void main(String[] args) {

        String dirPath = "D:\\tmp\\myFile.txt";

        File file = new File(dirPath);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "Some strings";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println("File is writable - " + ((file.canWrite()) ? "Yes" : "No"));

 //       file.delete();
    }
}
 /*       try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This method is used to flush the writer.");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);
            int i;
     //       String str = "";
            while ((i = fileReader.read()) != -1) {
      //          str += (char) i;
                System.out.print((char) i);
            }
     //       System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
*/