package encodingdecodingtest;

import encodingdecoding.*;

import org.junit.Test;
import readerwriter.*;


import java.io.FileNotFoundException;


import static org.junit.Assert.assertEquals;

public class EncoderTest {


    @Test
    public void stringShouldEncodedInUpperCase() throws FileNotFoundException {
        String expected = "RAHUL";
        Encoder encoder = new Encoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        byte[] encoded = encoder.encode(userInput, table.generateUpperBinaryTable());
        writer.write(encoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String actual = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        assertEquals(expected, actual);

    }


}
