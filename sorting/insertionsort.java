package sorting;

import java.util.Scanner;

public class insertionsort {
    static void swap(int[] arr,int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          int count=0;
        for(int i=0;i<n;i++){
            int j=i;
          
            while(j>0&&arr[j-1]>arr[j]){
                swap(arr,j);
                j--;
                count=1;
            }
             if(count==0){
            break;
        }
        }
       
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        
        sc.close();
    }
}
