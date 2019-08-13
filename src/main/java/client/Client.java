package client;

import encodingdecoding.*;
import readerwriter.*;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

class Client {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Reader reader = new Reader();
        Writer writer = new Writer();
        BitsTable bt = new BitsTable();
        UniqueCharacter uniqueCharacters = new UniqueCharacter();
        Bits bits = new Bits();
        BitsTableWriter bitsTableWriter = new BitsTableWriter();

        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        Set<Character> uniqueCharactersSet = uniqueCharacters.getUniqueCharacters(userInput);

        int bit = bits.getNumberOfBitsRequired(uniqueCharactersSet.size());
        Map<Character, boolean[]> bitsTable = bt.generateUniqueCharactersBinaryTable(bit, uniqueCharactersSet);
        bitsTableWriter.write(bitsTable);

//        byte[] userInputEncoded = encoder.encode(userInput, bitsTable);
//        writer.write(userInputEncoded, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
//        String encodedData = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
//        System.out.println(encodedData);
    }
}
