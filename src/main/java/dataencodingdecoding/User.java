package dataencodingdecoding;

public class User {
    public static void main(String[] args) {
        String userInput = "rahul";
        Encoding encoding = new Encoding();
        System.out.println(encoding.encoding(userInput, EncodingDecodingTable.generateBinaryTable()));
    }
}
