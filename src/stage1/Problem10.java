package stage1;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long possible = 0;

        for (int a = (int) Math.pow(10, n - 1); a < (int) Math.pow(10, n); a++) {
            char[] aChar = Integer.toString(a).toCharArray();
            long currPossibles = 1;

            for (int i = 0; i < n; i++) {
                currPossibles *= (i == 0 ? 9 : 10) - (aChar[i] - 48);
            }

            //System.out.println(a + " - " + currPossibles);
            possible += currPossibles;
        }

        System.out.println(possible);
    }
}
