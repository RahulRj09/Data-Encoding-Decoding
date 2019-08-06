package encodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private static List<String> table = new ArrayList<>();

    public List<String> generateBinaryTable() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < 8 - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.add(fixed.toString());
        }
        return table;
    }
}



