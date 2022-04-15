package project7;

/**
 *
 * @author rileyoest
 */
public class Utilities {

    protected static int recursiveFib(int x) {
        if (x <= 2){
            return 1;
        }
        else{
            return recursiveFib(x - 2) + recursiveFib(x - 1);

        }
    }

    protected static long iterativeFib(int n) {

        long retVal;
        if (n <= 2) {
            retVal = 1;
        } else {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            for (int i = 3; i <= n; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            retVal = newValue;
        }
        return retVal;

    }
}
