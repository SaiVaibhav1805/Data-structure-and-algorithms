import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char ch;   
        for(int i=0;i<n;i++){
            for(ch='A';ch<'A'+(n-i+1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        scanner.close();

    }
}
