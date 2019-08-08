package encodingdecodingtest;

import org.junit.Test;
import readerwriter.Reader;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class ReaderTest {
    @Test
    public void shouldDataRead() throws FileNotFoundException {
        Reader reader = new Reader();
        String path = "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput";
        String expected = "rahul";
        assertEquals(expected, reader.read(path));

    }
}
