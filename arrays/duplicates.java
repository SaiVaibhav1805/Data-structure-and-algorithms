package arrays;

// import java.util.HashSet;
import java.util.Scanner;
// import java.util.Set;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     Set<Integer> set = new HashSet<>();
    //     Set<Integer> dupli=new HashSet<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    //     for(int i=0;i<n;i++){
    //         set.add(arr[i]);
    //     }
    //     for(int x:arr){
    //         if(!set.add(x)){
    //             dupli.add(x);
    //         }
    //     }
    //     // int count=n-set.size();
    //     // System.out.println(count);    //unique elements
    //     System.out.println(dupli.size());
        sc.close();
    }
}
