package encodingdecoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Table {

    public Map<Integer, String> generateBinaryTable() {
        Map<Integer, String> table = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < 8 - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.put(i, fixed.toString());
        }
        return table;
    }

    public Map<Integer, String> generateUpperBinaryTable() {

        Map<Integer, String> encoding = new HashMap<>();
        int diff = 'a' - 'A';

        for (char i = 'A'; i < 'z'; i++) {
            if (i >= 'a') {
                encoding.put((int) i, Integer.toBinaryString(i - diff));
            } else {
                encoding.put((int) i, Integer.toBinaryString(i));
            }
        }

        return encoding;
    }
    public Map<Character,String> generateUniqueCharactersTable(HashSet uniqueCharacters){

        return null;
    }
}



