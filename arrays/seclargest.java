package arrays;

import java.util.Scanner;

public class seclargest {

    public static int slargest(int arr[]){
        int n=arr.length;
        int largest=arr[0];
        int sec=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sec=largest;
                largest=arr[i];
            }                       //Optimal solution
            else if(arr[i]<largest&&arr[i]>sec){
                sec=arr[i];
            }
        }
        return sec;
    }
    //     int max=arr[0];
    //     int k=arr.length;
    //     for(int i=0;i<k;i++){
    //         if(arr[i]>max){
    //             max=arr[i];          //better solution
    //         }
    //     }
    //         int sec=-1;
    //         for(int i=0;i<k;i++){
    //             if(arr[i]!=max&&arr[i]>sec){
    //                 sec=arr[i];
    //             }
    //         }
        

    //     return sec;
    // }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=slargest(arr);
        System.out.println(result);
        sc.close();
    }
    
}
