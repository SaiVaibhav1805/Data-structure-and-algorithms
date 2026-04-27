package basic_maths;
import java.util.*;
public class count {
    
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            count=1;
        }else{
        while(n>0){
            count++;
             n=n/10;
            
        }
        System.out.println(count);
        sc.close();
        }
    }
    }

