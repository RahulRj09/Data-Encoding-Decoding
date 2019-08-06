package dataencodingdecodingtest;

import encodingdecoding.Encoder;
import encodingdecoding.Table;
import org.junit.Test;

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
