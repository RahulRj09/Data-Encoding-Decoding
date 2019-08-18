package encodingdecodingtest;

import encodingdecoding.BinaryTableBits;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BitsCounterTableTest {
    @Test
    public void shouldGenerateUniqueCharactersBinaryTable() {
        HashSet uniqueCharacters = new HashSet<>(Arrays.asList('r', 'a', 'h', 'u', 'l'));
        BinaryTableBits bt = new BinaryTableBits();
        Map<Character, String> expected = new HashMap<>();
        expected.put('a', "000");
        expected.put('r', "001");
        expected.put('u', "010");
        expected.put('h', "011");
        expected.put('l', "100");
        assertEquals(expected, bt.generateBinaryTable(3, uniqueCharacters));

    }
}

