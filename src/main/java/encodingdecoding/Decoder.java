package encodingdecoding;

import java.util.ArrayList;
import java.util.List;

class Decoder {
    String decoding(String encodedData, List<String> table) {
        StringBuilder decodedData = new StringBuilder();
        List<String> encoded = convertStringToList(encodedData);
        for (String data : encoded) {
            decodedData.append((char) table.indexOf(data));
        }

        return decodedData.toString();
    }

    private List<String> convertStringToList(String encodedData) {
        String data = "";
        List<String> encoded = new ArrayList<>();
        for (int i = 0; i < encodedData.length(); i++) {
            data += encodedData.charAt(i);
            if (data.length() == 8) {
                encoded.add(data);
                data = "";
            }
        }
        return encoded;
    }
}
