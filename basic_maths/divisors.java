// package basic_maths;

// import java.util.Scanner;

// public class divisors {
//     void findDivisors(int n){
//         for(int i=1;i<=n;i++){
//             if(n%i==0){                                              //This is good but the time complexity is O(n)
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         divisors obj=new divisors();
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         obj.findDivisors(n);
//         sc.close();
//     }
// }


package basic_maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class divisors {
    void findDivisors(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(i!=n/i){
                    arr.add(n/i);
                    Collections.sort(arr);
                }
                
            }
           
        }
         System.out.println(arr);
    }
    public static void main(String[] args) {
        divisors obj=new divisors();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        obj.findDivisors(n);
        sc.close();
    }
}
