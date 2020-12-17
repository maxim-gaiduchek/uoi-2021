package stage1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Problem9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) list.add(scan.nextInt());

        for (int x : new HashSet<>(list)) {
            List<Integer> indexes = getAllIndexes(list, x);

            if (indexes.size() > 2) {
                int cuts = 0;

                for (int i = 0; i < indexes.size(); i++) {
                    int index = indexes.get(i);

                    if (index == list.size() - 1 && indexes.get(0) == 0) {
                        cuts++;
                    } else if (i == indexes.size() - 1) {
                        break;
                    } else if (indexes.get(i + 1) - index == 1) {
                        cuts++;
                    }

                    if (cuts == 2) {
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println("No");
    }

    private static List<Integer> getAllIndexes(List<Integer> list, int value) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                indexes.add(i);
            }
        }

        return indexes;
    }
}
