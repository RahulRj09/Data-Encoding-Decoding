package encodingdecoding;

public class Bits {
    public int getNumberOfBitsRequired(int lengthOfUniqueCharacters) {
        for (int i = 0; i <= lengthOfUniqueCharacters; i++) {
            int power = (int) Math.pow(2, i);
            if (power > lengthOfUniqueCharacters) {
                return i;
            }
        }
        return 0;
    }
}
