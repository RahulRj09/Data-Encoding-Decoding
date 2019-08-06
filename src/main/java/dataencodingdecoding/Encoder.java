package dataencodingdecoding;


import java.util.List;

public class Encoder {
    public String encoding(String userInput, List<String> table) {
        String encodedData = "";
        for (int i = 0; i < userInput.length(); i++) {
            encodedData += (table.get((int) userInput.charAt(i)));
        }
        return encodedData;
    }

}
