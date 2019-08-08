package encodingdecodingtest;

import encodingdecoding.*;

import org.junit.Test;
import readerwriter.*;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;

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
    @Test
    public void shouldGiveThelengthOfUniqueCharactersInString(){
        String actual = "rahulram";
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int expected = 6;
        assertEquals(expected,uniqueCharacter.getUniqueCharacters(actual).size());
    }
//    @Test
//    public void binaryShouldDecodedInString() throws FileNotFoundException {
//        Encoder encoder = new Encoder();
//        Table table = new Table();
//        Reader reader = new Reader();
//        Writer writer = new Writer();
//        Decoder decoder = new Decoder();
//        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
//        byte[] encoded = encoder.encode(userInput, table.generateBinaryTable());
//        writer.write(encoded,
//                "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
//        assertEquals(userInput, decoder.getDecodeData(encoded, table.generateBinaryTable()));
//    }

}
