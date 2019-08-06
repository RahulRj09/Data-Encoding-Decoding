package readerwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {
    public void writer(String encodedData, String path) {
        File filePath = new File(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(encodedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
