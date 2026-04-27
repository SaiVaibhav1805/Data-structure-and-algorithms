import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char ch='E';
            for(ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
