package stage1;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.next().split("");
        char c = line[0].charAt(0);
        int a = Integer.parseInt(line[1]);

        System.out.println((c + a) % 2 == 0 ? "BLACK" : "WHITE");
    }
}
