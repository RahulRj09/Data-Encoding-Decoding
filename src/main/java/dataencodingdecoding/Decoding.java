package dataencodingdecoding;

import java.util.List;

class Decoding {
    String decoding(List<String> encodedData, List<String> table){
        StringBuilder decodedData = new StringBuilder();
        for (String encodedDatum : encodedData) {
            decodedData.append((char) table.indexOf(encodedDatum));
        }
        return decodedData.toString();
    }
}
