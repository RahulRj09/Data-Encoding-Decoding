package dataencodingdecoding;

public class User {
    public static void main(String[] args) {
        Encoder encoding = new Encoder();
        Decoder decoding = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        String userInput = reader.reader("/Users/rahul.joshi/dataencodingdecoding/src/main/java/dataencodingdecoding/UserInput");
        String encodedData = encoding.encoding(userInput, table.generateBinaryTable());
        System.out.println(decoding.decoding(encodedData, table.generateBinaryTable()));
    }
}
