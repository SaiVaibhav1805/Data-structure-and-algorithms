package basic_maths;

import java.util.Scanner;

public class gcd {
    int hcf(int a,int b){
        while(a>0 && b>0){
            if(a>b){ a=a%b;}
            else{ b=b%a;}
        }
        if(a==0)return b;
        return a;
    }
    
    public static void main(String[] args) {
        gcd obj=new gcd();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=obj.hcf(a,b);
        System.out.println(res);
        sc.close();
    }
}
