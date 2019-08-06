package encodingdecoding;

import readerwriter.Reader;
import readerwriter.Writer;

import java.io.FileNotFoundException;

public class User {
    public static void main(String[] args) throws FileNotFoundException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        String userInputEncoded = encoder.encode(userInput, table.generateBinaryTable());
        System.out.println(userInputEncoded);
        writer.write(userInputEncoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String encodedData = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String decoded = decoder.getDecodeData(encodedData, table.generateBinaryTable());
        writer.write(decoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/DecodedData");
        System.out.println(decoded);
   }
}
