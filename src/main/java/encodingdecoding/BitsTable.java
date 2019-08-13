package encodingdecoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BitsTable {
    public Map<Character, boolean[]> generateUniqueCharactersBinaryTable(int bit, Set uniqueCharacters) {
        Map<Character, boolean[]> bits = new HashMap<>();

        int bin = 0;
        for (Object word : uniqueCharacters) {
            char word1 = (char) word;
            String binaryNumber = Integer.toBinaryString(bin);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < bit - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            boolean[] booleans = toBoolean(fixed);
            bits.put(word1, booleans);
            bin += 1;

        }
        return bits;
    }

    boolean[] toBoolean(StringBuilder fixed) {
        boolean[] booleans = new boolean[3];
        for (int i = 0; i < fixed.toString().length(); i++) {
            char temp = fixed.toString().charAt(i);
            if (temp == '0') {
                booleans[i] = false;
            } else {
                booleans[i] = true;
            }

        }
        return booleans;
    }
}
