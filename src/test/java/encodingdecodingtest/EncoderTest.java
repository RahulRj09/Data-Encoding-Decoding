package encodingdecodingtest;

import encodingdecoding.Encoder;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncoderTest {
    @Test
    public void shouldEncodeStringWithOnlyOneUniqueCharacterAccordingToTheTable() {
        HashMap<Character, String> table = new HashMap<>();
        String data = "a";

        table.put('a', "0");

        List<Boolean> actualEncodedData = new Encoder().encode(data, table);
        List<Boolean> expectedEncodedData = Arrays.asList(false);
        assertEquals(expectedEncodedData, actualEncodedData);
    }

    @Test
    public void shouldEncodeAStringLike_abab_AccordingToTheTable() {
        HashMap<Character, String> table = new HashMap<>();
        String data = "abab";

        table.put('a', "0");
        table.put('b', "1");

        List<Boolean> actualEncodedData = new Encoder().encode(data, table);
        List<Boolean> expectedEncodedData = Arrays.asList(false, true, false, true);
        assertEquals(expectedEncodedData, actualEncodedData);
    }

//    @Test
//    public void shouldEncodeAStringLike_abab_AccordingToTheDifferentTable() {
//        HashMap<Character, String> table = new HashMap<>();
//        String data = "abab";
//
//        table.put('a', "1");
//        table.put('b', "0");
//
//        boolean[] actualEncodedData = new Encoder().encode(data, table);
//        boolean[] expectedEncodedData = {true, false, true, false};
//        assertArrayEquals(expectedEncodedData, actualEncodedData);
//    }


}
