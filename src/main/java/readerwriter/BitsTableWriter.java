package readerwriter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class BitsTableWriter {
     public void write(Map bitsTable) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/BitsTable.json"),
                    bitsTable);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
