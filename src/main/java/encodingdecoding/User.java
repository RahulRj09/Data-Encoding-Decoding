package encodingdecoding;

import readerwriter.*;

import java.io.IOException;

class User {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        byte[] userInputEncoded = encoder.encode(userInput, table.generateUpperBinaryTable());
        writer.write(userInputEncoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String encodedData = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        System.out.println(encodedData);
//      String decoded = decoder.getDecodeData(encodedData, table.generateBinaryTable());
//      writer.write(decoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/DecodedData");
//      System.out.println(decoded);
    }
}
