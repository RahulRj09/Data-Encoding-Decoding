package client;

import encodingdecoding.*;
import readerwriter.*;

import java.io.IOException;
import java.util.List;
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
        ByteConverter byteConverter = new ByteConverter();

        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        Set<Character> uniqueCharactersSet = uniqueCharacters.getUniqueCharacters(userInput);

        int bit = bits.getNumberOfBitsRequired(uniqueCharactersSet.size());
        Map<Character, String> bitsTable = bt.generateUniqueCharactersBinaryTable(bit, uniqueCharactersSet);
        bitsTableWriter.write(bitsTable);

        List<Boolean> userInputEncoded = encoder.encode(userInput, bitsTable);
        byte[] bytes = byteConverter.toBytes(userInputEncoded);
        System.out.println(bytes[0]);
        writer.write(bytes, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
    }
}
