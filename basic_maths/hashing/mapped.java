package basic_maths.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class mapped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int num = sc.nextInt();
            System.out.println(hmap.getOrDefault(num, 0));
        }

        sc.close();
    }
}
