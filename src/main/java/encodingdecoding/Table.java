package encodingdecoding;

import java.util.HashMap;
import java.util.Map;

public class Table {
    Map<Integer, String> table = new HashMap<>();

    public Map<Integer, String> generateBinaryTable() {
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
}



