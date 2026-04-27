
import java.util.Scanner;
public class pattern8 {
    
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            scanner.close();
             for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
