package encodingdecoding;

import java.util.Map;

public class Encoder {
    public byte[] encode(String userInput, Map<Character, String> table) {

        byte[] encodedData = new byte[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            encodedData[i] = Byte.parseByte(table.get(character), 2);
        }
        return encodedData;
    }
}
