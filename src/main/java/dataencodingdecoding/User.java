package dataencodingdecoding;

import java.util.List;

public class User {
    public static void main(String[] args) {
        String userInput = "rahul";
        Encoding encoding = new Encoding();
        Decoding decoding = new Decoding();
        List<String> encodedData = encoding.encoding(userInput, EncodingDecodingTable.generateBinaryTable());
        System.out.println(decoding.decoding(encodedData,EncodingDecodingTable.generateBinaryTable()));
    }
}
