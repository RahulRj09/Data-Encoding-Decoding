package encodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class ByteConverter {
    public byte[] toBytes(List<Boolean> encodedBits) {
        List<Byte> bytes = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int FIXED_LENGTH_OF_TEMP = 8;
        for (Boolean bool : encodedBits) {
            if (bool.equals(true)) {
                temp.append(1);
            } else {
                temp.append(0);
            }
            if (temp.length() == FIXED_LENGTH_OF_TEMP) {
                bytes.add((byte) Integer.parseInt(temp.toString(), 2));
                temp = new StringBuilder();
            }
        }
        return getBytesArray(bytes);
    }

    private byte[] getBytesArray(List<Byte> bytes) {
        int index = 0;
        byte[] arrayOfBytes = new byte[bytes.size()];
        for (Byte bits : bytes) {
            arrayOfBytes[index] = bits;
            index += 1;
        }
        return arrayOfBytes;
    }
}
