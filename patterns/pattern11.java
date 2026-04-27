
import java.util.Scanner;


public class pattern11 {
    public static void main(String[] args) {
        

    Scanner scanner=new Scanner(System.in);
    int num=1;
    int n=scanner.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print(num);
            num+=1;

        }
        System.out.println();
    }
    scanner.close();
}
}
