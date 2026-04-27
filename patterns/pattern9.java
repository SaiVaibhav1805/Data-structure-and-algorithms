
import java.util.Scanner;

public class pattern9 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            
                int k=1;
                if(i%2==0){
                    k=1;
                }
                    else{
                        k=0;
                    }
                for(int j=1;j<i;j++){
                    System.out.print(k);
                    k=1-k;
                }
                System.out.println();
            }
            scanner.close();
        }
    }
    

