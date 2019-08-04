package dataencodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class EncodingDecodingTable {
    static List<String> table = new ArrayList<>();

    public static List<String> generateBinaryTable() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            String zero = "";
            for (int j = 0; j < 8-binaryNumber.length(); j++) {
                zero +="0";
            }
            zero +=binaryNumber;
            table.add(zero);
        }
        return table;
    }
}



