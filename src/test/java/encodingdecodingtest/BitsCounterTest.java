package encodingdecodingtest;

import encodingdecoding.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitsCounterTest {
    @Test
    public void shouldGiveTheNumberOfBitsInWhichUniqueCharacterRepresent() {
        BitsCounter bits = new BitsCounter();
        int expected = 3;
        int actual = 6;
        assertEquals(expected, bits.getBits(actual));
    }
}
