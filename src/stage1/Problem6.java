package stage1;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int m = 0, f = 0;
        for (int i = 0; i < n; i++) {
            if (scan.nextInt() == 1) {
                m++;
            } else {
                f++;
            }
        }

        System.out.println(Math.min(m, f));
    }
}
