package encodingdecodingtest;

import encodingdecoding.UniqueCharacter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharacterTest {
    @Test
    public void shouldGiveTheLengthOfUniqueCharactersInString() {
        String userInput = "rahulram";
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        int expected = 6;
        assertEquals(expected, uniqueCharacter.getUniqueCharacters(userInput).size());
    }
}
