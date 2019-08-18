package encodingdecoding;

import java.util.Map;

public class Decoder {
    public String getDecodeBinary(byte[] bytes, Map<Integer, String> table) {
        StringBuilder decodedData = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            decodedData.append(table.get((int)bytes[i]));
        }
        return decodedData.toString();
    }
}
