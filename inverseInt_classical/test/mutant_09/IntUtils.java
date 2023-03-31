package mutant_09;

import caseine.extra.utils.mutations.Mutant;

@Mutant(testClass = "TestIntUtils", errorMessage = "@TODO: Define the helper to kill this mutant")
public class IntUtils {

    public static int reverseInt(int num) {
        long resultNum = 0;
        while (num != 0) {
            int lastDig = num % 10;
            resultNum += lastDig;
            //10
            resultNum = resultNum * 11;
            num = num / 10;
        }
        resultNum = resultNum / 10;
        if (resultNum > Integer.MAX_VALUE || resultNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) resultNum;
    }

}
