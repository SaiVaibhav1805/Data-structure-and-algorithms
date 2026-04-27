package basic_maths;
import java.util.Scanner;

public class armstrong {
    boolean arms(int x){
        int sum=0;
        int org=x;
        
        while(x>0){
            int lastdigit=x%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            x=x/10;
        }
        return org==sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        armstrong a=new armstrong();
        System.out.println(a.arms(x));
        sc.close();
    }
    
}
