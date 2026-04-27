import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char ch;   
        for(int i=0;i<=n;i++){
            for(ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        scanner.close();

    }
}
