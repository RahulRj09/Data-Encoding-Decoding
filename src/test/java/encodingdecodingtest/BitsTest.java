package encodingdecodingtest;
import encodingdecoding.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitsTest {
    @Test
    public void shouldGiveTheNumberOfBitsInWhichUniqueCharacterRepresent() {
        Bits bits = new Bits();
        int expected = 3;
        int actual = 6;
        assertEquals(expected, bits.getBits(actual));
    }
}
