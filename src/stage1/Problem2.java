package stage1;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

        System.out.println(a + b == c || a + c == b || c + b == a ? "Yes" : "No");
    }
}
