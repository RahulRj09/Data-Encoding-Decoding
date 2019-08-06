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
        String userInput = reader.reader("/Users/rahul.joshi/encodingdecoding/src/main/java/resources/UserInput");
        String userInputEncoded = encoder.encode(userInput, table.generateBinaryTable());
        writer.writer(userInputEncoded, "/Users/rahul.joshi/encodingdecoding/src/main/java/resources/EncodedData");
        String encodedData = reader.reader("/Users/rahul.joshi/encodingdecoding/src/main/java/resources/EncodedData");
        String decoded = decoder.decode(encodedData, table.generateBinaryTable());
        writer.writer(decoded, "/Users/rahul.joshi/encodingdecoding/src/main/java/resources/DecodedData");
        System.out.println(decoded);
    }
}
