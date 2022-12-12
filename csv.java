package samples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleDataFile {
    public static void main(String args[]) throws IOException {
        String headerToSave = "\"ID\",\"Fullname\",\"BDay\",\"BPlace\",\"ContactNo\"\n";
        String dataToSave = "\"1\",\"Pags\",\"06-05-1984\",\"Bulan\",\"09163309202\"\n";
        File myFile = new File("sample_data_text.csv");
        FileWriter myFileWriter = new FileWriter(myFile, true);
        myFileWriter.write(headerToSave);
        myFileWriter.write(dataToSave);
        myFileWriter.close();
    }
}ass