package basic_maths.hashing;

import java.util.Scanner;

public class fetch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] hash = new int[1000000000];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int q = sc.nextInt();  //queries: no of queries
        while (q-- > 0) {
            int num = sc.nextInt();   //checks for what number repeats at the specific index from above iteration
            System.out.println(hash[num]);
        }

        sc.close();
    }
}
