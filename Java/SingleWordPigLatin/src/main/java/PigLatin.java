/**
 * Created by locle on 3/14/16.
 */
public class PigLatin {

    public String translate(String str){
        if (containsNonAlpha(str)) {
            return null;
        }

        String wordInLowerCase = str.toLowerCase();
        int firstVowelIndex = getFirstVowelIndex(wordInLowerCase);
        switch (firstVowelIndex) {
            case -1:
                return wordInLowerCase.concat("ay");
            case 0:
                return wordInLowerCase.concat("way");
            default:
                return wordInLowerCase.substring(firstVowelIndex)
                        .concat(wordInLowerCase.substring(0, firstVowelIndex))
                        .concat("ay");
        }
    }

    private boolean containsNonAlpha(String str) {
        boolean containsNonAlpha = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                containsNonAlpha = true;
                break;
            }
        }
        return containsNonAlpha;
    }

    private int getFirstVowelIndex(String lowerCase) {
        int firstVowelIndex = -1;
        for (int i = 0; i < lowerCase.length(); i++) {
            if ("aeiou".indexOf(lowerCase.charAt(i)) >= 0) {
                firstVowelIndex = i;
                break;
            }
        }
        return firstVowelIndex;
    }
}
