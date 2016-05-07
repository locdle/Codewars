/**
 * Created by locle on 5/6/16.
 */
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        // your code
        int [] result =  new int[3];
        int speedDifferent = v2 - v1;

        if (v1 >= v2) {
            return null;
        }
        else{
                int timeAsSecondToCatchUP =  ( g * 3600 / speedDifferent );
                int hour = (int) (timeAsSecondToCatchUP/3600);
                int minutes = (int) ((timeAsSecondToCatchUP - hour * 3600)/60);
                int second = (int) (timeAsSecondToCatchUP - (hour * 3600) - (minutes * 60));
                result[0] = hour;
                result[1] = minutes;
                result[2] = second;
                return  result;
        }
    }
}
