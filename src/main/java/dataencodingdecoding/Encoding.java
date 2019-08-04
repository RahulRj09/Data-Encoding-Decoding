package dataencodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class Encoding {
    public List<String> encoding(String userInput, List<String> table) {
        List<String> encodedData = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++) {
            encodedData.add(table.get((int) userInput.charAt(i)));
        }
        return encodedData;
    }

}
