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
        BinaryTableBits bt = new BinaryTableBits();
        UniqueCharacter uniqueCharacters = new UniqueCharacter();
        BitsCounter bits = new BitsCounter();
        BitsTableWriter bitsTableWriter = new BitsTableWriter();
        ByteConverter byteConverter = new ByteConverter();
        Decoder decoder = new Decoder();
        DecoderBinaryTable decoderBinaryTable = new DecoderBinaryTable();
        BinaryToStringConverter binaryToStringConverter = new BinaryToStringConverter();

        String userInput = reader.read("/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/UserInput");
        Set<Character> uniqueCharactersSet = uniqueCharacters.getUniqueCharacters(userInput);

        int bit = bits.getBits(uniqueCharactersSet.size());
        Map<Character, String> bitsTable = bt.generateBinaryTable(bit, uniqueCharactersSet);
        bitsTableWriter.write(bitsTable);

        List<Boolean> userInputEncoded = encoder.encode(userInput, bitsTable);
        byte[] bytes = byteConverter.toBytes(userInputEncoded);

        writer.write(bytes, "/Users/rahul.joshi/dataencodingdecoding/src/main/java/resources/EncodedData");
        String decodedData = decoder.getDecodeBinary(bytes, decoderBinaryTable.getDecodedBinaryTable(bytes));
        System.out.println(binaryToStringConverter.getDecodeData(decodedData, bitsTable, bit));

    }
}
