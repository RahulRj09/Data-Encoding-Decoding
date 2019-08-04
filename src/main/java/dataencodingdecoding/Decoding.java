package dataencodingdecoding;

import java.util.List;

public class Decoding {
    String decoding(List<String> encodedData, List<String> table){
        String decodedData = "";
        for (int i = 0; i < encodedData.size(); i++) {
            decodedData += (char) table.indexOf(encodedData.get(i));
        }
        return decodedData;
    }
}
