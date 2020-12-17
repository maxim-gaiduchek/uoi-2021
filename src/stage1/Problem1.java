package stage1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt(), m = scan.nextInt(), o = scan.nextInt();

        if (p > m && p > o) {
            System.out.println("Petryk");
        } else if (m > p && m > o) {
            System.out.println("Marichka");
        } else {
            System.out.println("Olenka");
        }
    }
}
