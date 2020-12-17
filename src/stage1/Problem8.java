package stage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) list.add(scan.nextInt());

        System.out.println(Math.max(n, list.stream().max(Integer::compareTo).orElse(0)));
    }
}
