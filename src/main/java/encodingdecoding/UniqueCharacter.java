package encodingdecoding;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
    int getUniqueCharacters(String userInput) {
        Set<Character> uniqueCharacters = new HashSet<>();
        for (int i = 0; i < userInput.length(); i++) {
            uniqueCharacters.add(userInput.charAt(i));
        }
        return uniqueCharacters.size();
    }
}
