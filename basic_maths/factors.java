package basic_maths;

import java.util.ArrayList;

public class factors {
    public static ArrayList<Integer> printdivisors(int n){
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int num=10;
        ArrayList<Integer> divisors=printdivisors(num);
        for(int x:divisors){
            System.out.print(x+" ");
        }
    }
}
