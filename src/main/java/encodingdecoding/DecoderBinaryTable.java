package encodingdecoding;

import java.util.HashMap;
import java.util.Map;

public class DecoderBinaryTable {
    public Map<Integer, String> getDecodedBinaryTable(byte[] bytes) {
        Map<Integer, String> decodedTable = new HashMap<>();
        for (Byte aByte : bytes) {
            String binaryNumber = Integer.toBinaryString((int) aByte);
            if (binaryNumber.length() < 8) {
                StringBuilder fixed = new StringBuilder();
                fixed.append("0".repeat(8 - binaryNumber.length()));
                fixed.append(binaryNumber);
                decodedTable.put((int) aByte, fixed.toString());
            } else {
                decodedTable.put((int) aByte, binaryNumber);
            }

        }
        System.out.println(decodedTable);
        return decodedTable;
    }

}
