package dataencodingdecoding;

import java.io.FileNotFoundException;

public class User {
    public static void main(String[] args) throws FileNotFoundException {
        Encoder encoding = new Encoder();
        Decoder decoding = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        String userInput = reader.reader("/Users/rahul.joshi/dataencodingdecoding/src/main/java/dataencodingdecoding/UserInput");
        String userInputEncoded = encoding.encoding(userInput, table.generateBinaryTable());
        writer.writer(userInputEncoded,"/Users/rahul.joshi/dataencodingdecoding/src/main/java/dataencodingdecoding/EncodedData");
        String encodedData = reader.reader("/Users/rahul.joshi/dataencodingdecoding/src/main/java/dataencodingdecoding/EncodedData");
        System.out.println(decoding.decoding(encodedData, table.generateBinaryTable()));
    }
}
