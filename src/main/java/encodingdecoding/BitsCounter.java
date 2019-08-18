package encodingdecoding;

public class BitsCounter {
    public int getBits(int uniqueElements) {
        for (int i = 0; i <= uniqueElements; i++) {
            int power = (int) Math.pow(2, i);
            if (power > uniqueElements) {
                return i;
            }
        }
        return 0;
    }
}
