package arrays;

import java.util.Scanner;

public class issorted {

    public static boolean sorted(int arr[]){
        int k=arr.length;
        boolean asc=true;
        boolean desc=true;
        for(int i=0;i<k-1;i++){
            if(arr[i]<arr[i+1]){
                asc=false;
            }
            if(arr[i]>arr[i+1]){
                desc=false;
            }

          
        }
         return asc||desc;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result=sorted(arr);
        System.out.println(result);
        sc.close();
    }
}
