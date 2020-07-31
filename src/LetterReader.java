import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LetterReader {

    public static void main(String[] args) {

        String randomWords = "If the product of two terms is " +
                "zero then common sense says at least one of " +
                "the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can " +
                "be factored allowing that side of the equation to " +
                "equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";

        char[] charactersInString = randomWords.toCharArray();
        Arrays.sort(charactersInString);

        HashMap<Character, Integer> totalLetterTally = new HashMap<>();

        //create empty base key/pair values in hashmap
        for( char character : charactersInString) {
            if(!totalLetterTally.containsKey(character)) {
                totalLetterTally.put(character, 0);
            }
        }

        //add to the values of each character key in hashmap
        for (Map.Entry<Character, Integer> keyPair : totalLetterTally.entrySet()) {
            for( char characterOriginal : charactersInString) {
                //totalLetterTally.replace(keyPair, keyPair.getValue() + 1);
                if (keyPair.getKey() == characterOriginal) {
                    keyPair.setValue(keyPair.getValue() + 1);
                }
            }
            System.out.println(keyPair.getKey() + " = " + keyPair.getValue());
        }
    }
}
