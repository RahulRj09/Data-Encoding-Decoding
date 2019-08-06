package dataencodingdecodingtest;

import dataencodingdecoding.Encoder;
import dataencodingdecoding.Table;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncodingDecodingTest {
    @Test
    public void shouldDataEncoded() {
        String expected = "0111001001100001011010000111010101101100";
        String userInput = "rahul";
        Encoder encoding = new Encoder();
        Table table = new Table();
        assertEquals(expected,encoding.encoding(userInput, table.generateBinaryTable()));

    }

}
