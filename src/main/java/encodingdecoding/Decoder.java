package encodingdecoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Decoder {
    public String getDecodeData(String encodedData, Map<Integer, String> table) {
        StringBuilder decodedData = new StringBuilder();
        List<String> encoded = convertStringToList(encodedData);
        for (String value : encoded) {
            decodedData.append((char) getKey(value, table));
        }

        return decodedData.toString();
    }

    private List<String> convertStringToList(String encodedData) {
        StringBuilder data = new StringBuilder();
        List<String> encoded = new ArrayList<>();
        for (int i = 0; i < encodedData.length(); i++) {
            data.append(encodedData.charAt(i));
            if (data.length() == 8) {
                encoded.add(data.toString());
                data = new StringBuilder();
            }
        }
        return encoded;
    }

    private int getKey(String value, Map<Integer, String> table) {
        int key = 0;
        if (table.containsValue(value)) {
            for (Map.Entry<Integer, String> entry : table.entrySet()) {
                if (entry.getValue().equals(value)) {
                    key = entry.getKey();
                }
            }
        }
        return key;
    }

}
