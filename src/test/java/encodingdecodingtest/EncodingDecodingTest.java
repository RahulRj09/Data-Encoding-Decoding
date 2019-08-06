package encodingdecodingtest;

import encodingdecoding.*;

import org.junit.Test;
import readerwriter.*;


import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class EncodingDecodingTest {
    @Test
    public void shouldDataRead() throws FileNotFoundException {
        Reader reader = new Reader();
        String path = "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput";
        String expected = "rahul";
        assertEquals(expected, reader.read(path));

    }

    @Test
    public void stringShouldEncodedInBinary() throws FileNotFoundException {
        String expected = "0111001001100001011010000111010101101100";
        Encoder encoder = new Encoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        String encoded = encoder.encode(userInput, table.generateBinaryTable());
        writer.write(encoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String actual = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        assertEquals(expected, actual);

    }

    @Test
    public void binaryShouldDecodedInString() throws FileNotFoundException {
        Encoder encoder = new Encoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        Decoder decoder = new Decoder();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        String encoded = encoder.encode(userInput, table.generateBinaryTable());
        writer.write(encoded,
                "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        assertEquals(userInput, decoder.getDecodeData(encoded, table.generateBinaryTable()));
    }

}