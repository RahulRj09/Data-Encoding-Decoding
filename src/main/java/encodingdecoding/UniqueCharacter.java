package encodingdecoding;

import java.util.HashSet;

public class UniqueCharacter {
  public HashSet<Character> getUniqueCharacters(String userInput) {
        HashSet<Character> uniqueCharacters = new HashSet<>();
        for (int i = 0; i < userInput.length(); i++) {
            uniqueCharacters.add(userInput.charAt(i));
        }
        return uniqueCharacters;
    }
}
