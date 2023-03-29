public class IntUtils {

    public static int reverseInt(int num) {
        long resultNum = 0;
        while (num != 0) {
            int lastDig = num % 10;
            resultNum += lastDig;
            resultNum = resultNum * 10;
            num = num / 10;
        }
        resultNum = resultNum / 10;
        if (resultNum > Integer.MAX_VALUE || resultNum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) resultNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseInt(Integer.MIN_VALUE));
    }

}
