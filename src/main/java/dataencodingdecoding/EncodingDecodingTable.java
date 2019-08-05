package dataencodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class EncodingDecodingTable {
    private static List<String> table = new ArrayList<>();

    public static List<String> generateBinaryTable() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder zero = new StringBuilder();
            for (int j = 0; j < 8-binaryNumber.length(); j++) {
                zero.append("0");
            }
            zero.append(binaryNumber);
            table.add(zero.toString());
        }
        return table;
    }
}



