package stage1;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() /*U*/, b = scan.nextInt() /*P*/; // U
        int c = scan.nextInt() /*P*/, d = scan.nextInt() /*U*/; // P
        int u = a + d, p = b + c;

        if (u > p) {
            System.out.println("U");
        } else if (u < p) {
            System.out.println("P");
        } else {
            if (b > d) {
                System.out.println("P");
            } else if (b < d) {
                System.out.println("U");
            } else {
                System.out.println("T");
            }
        }
    }
}
