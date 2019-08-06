package encodingdecoding;


import java.util.Map;

public class Encoder {
    public String encode(String userInput, Map<Integer, String> table) {
        StringBuilder encodedData = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            encodedData.append(table.get((int) userInput.charAt(i)));
        }
        return encodedData.toString();
    }

}
