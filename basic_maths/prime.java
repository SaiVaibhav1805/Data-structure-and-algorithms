package basic_maths;

import java.util.Scanner;

public class prime {

    void primes(int n) {
        if (n <= 1) {
            System.out.println("false");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }

    public static void main(String[] args) {
        prime p = new prime();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        p.primes(x); 
        sc.close();
    }
}
