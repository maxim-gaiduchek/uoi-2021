package stage1;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt(), y1 = scan.nextInt();
        int x2 = scan.nextInt(), y2 = scan.nextInt();

        if (x1 > x2) {
            System.out.println(x2 + " " + y1 + " " + x1 + " " + y2);
        } else {
            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
        }
    }
}
