package encodingdecodingtest;

import encodingdecoding.BitsTable;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BitsTableTest {
    @Test
    public void shouldGenerateUniqueCharactersBinaryTable() {
        HashSet actual = new HashSet<>(Arrays.asList('r', 'a', 'h', 'u', 'l'));
        BitsTable bt = new BitsTable();
        Map<Character, String> expected = new HashMap<>();
        expected.put('a', "000");
        expected.put('r', "001");
        expected.put('u', "010");
        expected.put('h', "011");
        expected.put('l', "100");
        assertEquals(expected, bt.generateUniqueCharactersBinaryTable(3, actual));

    }
}

