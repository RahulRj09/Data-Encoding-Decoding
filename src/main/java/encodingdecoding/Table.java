package encodingdecoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private static Map<Integer,String> table = new HashMap<>();
    public Map<Integer, String> generateBinaryTable() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < 8 - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.put(i,fixed.toString());
        }
        return table;
    }

    public Map<Integer, String> generateBinaryTable2() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < 8 - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append("1");
            table.put(i,fixed.toString());
        }
        return table;
    }
}



