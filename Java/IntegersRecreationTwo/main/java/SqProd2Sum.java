import java.util.ArrayList;
import java.util.List;

/**
 * Created by locle on 3/27/16.
 */
public class SqProd2Sum {
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        int sum = (int) ((Math.pow(a, 2) + Math.pow(b,2)) *(Math.pow(c,2) + Math.pow(d,2)));
        List<long[]> result = new ArrayList<long[]>();

        int i = 1;
        while(sum - Math.pow(i, 2) > 0){
            if (Math.sqrt(sum - Math.pow(i, 2)) %1 == 0 ){
                long[] temp  = new long[] {i, (long) Math.sqrt(sum- Math.pow(i, 2))};
                result.add(temp);
            }
            i++;
        }
        return result;

    }
}
