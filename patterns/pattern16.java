import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            ch -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }
}
