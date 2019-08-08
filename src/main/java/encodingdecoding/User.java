package encodingdecoding;

import readerwriter.*;

import java.io.IOException;
import java.util.Map;
import java.util.Set;


class User {

    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        BitsTable bt = new BitsTable();
        UniqueCharacter uniqueCharacters = new UniqueCharacter();
        Bits bits = new Bits();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        Set uniqueCharactersSet = uniqueCharacters.getUniqueCharacters(userInput);
        int bit = bits.getBits(uniqueCharactersSet.size());
        Map bitsTable= bt.generateUniqueCharactersBinaryTable(bit, uniqueCharactersSet);
        byte[] userInputEncoded = encoder.encode(userInput, table.generateUpperBinaryTable());
        writer.write(userInputEncoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String encodedData = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        System.out.println(encodedData);
//        byte[] decoded = decoder.getDecodeData(encodedData.toLowerCase(), table.generateBinaryTable());
//        writer.write(decoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/DecodedData");
//        System.out.println(decoded);
    }
}
