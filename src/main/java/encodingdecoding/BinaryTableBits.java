package encodingdecoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BinaryTableBits {
    public Map<Character, String> generateBinaryTable(int numberOfBitsRequired, Set<Character> uniqueCharacters) {
        Map<Character, String> bits = new HashMap<>();

        int bin = 0;
        for (Character character : uniqueCharacters) {
            String binaryNumber = Integer.toBinaryString(bin);
            StringBuilder fixed = new StringBuilder();
            fixed.append("0".repeat(Math.max(0, numberOfBitsRequired - binaryNumber.length())));
            fixed.append(binaryNumber);
            bits.put(character, fixed.toString());
            bin += 1;

        }
        return bits;
    }
}
