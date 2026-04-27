
import java.util.*;
public class pattern10 {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
        
        }
}
