import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by charper on 3/21/2016.
 */

public class Order {
    public static String order(String words) throws NumberFormatException{
        String[] wordsInArray = words.split("");
        String result [] = new String[wordsInArray.length];

        for (int i = 0; i < wordsInArray.length; i++) {
            try {
                int index = Integer.parseInt(wordsInArray[i].replaceAll("[\\D]", ""));
                result[index - 1] = wordsInArray[i];
            }catch (NumberFormatException n){
                return "";
            }

        }
        System.out.println(Arrays.toString(result));
        return String.join("", result);
    }

    public static void main(String[] args) {
        String words = "is2 Thi1s T4est 3a";
        String[] wordsInArray = words.split("");
        String result [] = new String[wordsInArray.length];

        for (int i = 0; i < wordsInArray.length; i++) {
            try {
                System.out.println(wordsInArray.toString());
                int index = Integer.parseInt(wordsInArray[i].replaceAll("[\\D]", ""));
                result[index - 1] = wordsInArray[i];
                System.out.println("result @ index " + index + " " + result[index-1]);
            }catch (NumberFormatException n){
                System.out.println( "");
            }
        }
        System.out.println(String.join("", result));
    }
}

