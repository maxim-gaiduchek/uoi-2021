package stage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) list.add(scan.nextInt());

        System.out.println((list.stream().max(Integer::compareTo).get() - list.stream().min(Integer::compareTo).get()) * 2);
    }
}
