package encodingdecoding;

import readerwriter.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


class User {

    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        Table table = new Table();
        Reader reader = new Reader();
        Writer writer = new Writer();
        UniqueCharacter uniqueCharacters = new UniqueCharacter();
        Bits bites = new Bits();
        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        HashSet uniqueCharactersHashSet=uniqueCharacters.getUniqueCharacters(userInput);
        System.out.println(bites.getBits(uniqueCharactersHashSet.size()));
        System.out.println(table.generateUniqueCharactersTable(uniqueCharactersHashSet));
        byte[] userInputEncoded = encoder.encode(userInput, table.generateUpperBinaryTable());
        writer.write(userInputEncoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String encodedData = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        System.out.println(encodedData);
//        byte[] decoded = decoder.getDecodeData(encodedData.toLowerCase(), table.generateBinaryTable());
//        writer.write(decoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/DecodedData");
//        System.out.println(decoded);
    }
}
