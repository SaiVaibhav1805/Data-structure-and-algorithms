package arrays;

import java.util.Scanner;

public class leftrotate_optimal {
    
    public static void reverse(int arr[],int start,int end){
       
        while(start<end){
            int temp=arr[start];   
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr, 0, n-1);
        for(int  i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
