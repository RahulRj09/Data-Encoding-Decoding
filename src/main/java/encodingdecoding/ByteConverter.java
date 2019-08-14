package encodingdecoding;

import java.util.ArrayList;
import java.util.List;

public class ByteConverter {
    public byte[] toBytes(List<Boolean> encodedBits) {
        List<Byte> bytes = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (Boolean bool : encodedBits) {
            if (bool.equals(true)) {
                temp.append(1);
            } else {
                temp.append(0);
            }
            if (temp.length() == 8) {
                bytes.add((byte) Integer.parseInt(temp.toString(), 2));
                temp = new StringBuilder();
            }
        }
        for (int i = 0; i < 8 - temp.length(); i++) {
            temp.append("0");
            bytes.add((byte) Integer.parseInt(temp.toString(), 2));
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
