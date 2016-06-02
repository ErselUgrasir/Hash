package hash;

import java.math.BigInteger;

public class Hash {

    public static void main(String[] args) {

        System.out.println(BigInteger.valueOf(hashCode(X)));

    }

    public static int hashCode(String w) {
        int h = 0;
        if (h == 0 && w.toCharArray().length > 0) {
            char val[] = w.toCharArray();

            for (int i = 0; i < w.toCharArray().length; i++) {
                h = 31 * h + val[i];
            }
        }
        return h;
    }

    public static int hashCode(int w) {
        int x = 1, y = 1;
        while (w / x > 9) {
            x = x * 10;
            y++;
        }
        return (w + y) * 31;
    }

}
