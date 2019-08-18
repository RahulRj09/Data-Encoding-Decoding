package encodingdecoding;

import java.util.Map;

public class BinaryToStringConverter {
    public String getDecodeData(String decodedBinary, Map<Character, String> bitsTable, int numberOfBitsUsedToEncode) {
        StringBuilder data = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < decodedBinary.length(); i++) {
            temp.append(decodedBinary.charAt(i));
            if (temp.length() == numberOfBitsUsedToEncode) {
                char key = getKey(temp.toString(), bitsTable);
                if(key ==0){
                    temp = new StringBuilder();
                }
                else {
                    data.append(key);
                    temp = new StringBuilder();
                }
            }

        }
        return data.toString();
    }

    private char getKey(String value, Map<Character, String> table) {
        char key;
        if (table.containsValue(value)) {
            for (Map.Entry<Character, String> entry : table.entrySet()) {
                if (entry.getValue().equals(value)) {
                    key = entry.getKey();
                    return key;
                }
            }
        }
        return 0;
    }
}

