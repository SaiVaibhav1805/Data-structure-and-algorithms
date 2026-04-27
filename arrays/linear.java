package arrays;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print(i);
            }
            else{
                System.out.print(-1);
            }
        }
        sc.close();
        
    }
}
