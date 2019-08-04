package dataencodingdecodingtest;

import dataencodingdecoding.Encoding;
import dataencodingdecoding.EncodingDecodingTable;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncodingDecodingTest {
    @Test
    public void shouldDataEncodedOrNot() {
        List<String> expected = Arrays.asList("01110010", "01100001", "01101000", "01110101", "01101100");
        String userInput = "rahul";
        Encoding encoding = new Encoding();
        EncodingDecodingTable encodingDecodingTable = new EncodingDecodingTable();
        assertEquals(expected,encoding.encoding(userInput, encodingDecodingTable.generateBinaryTable()));

    }

}
