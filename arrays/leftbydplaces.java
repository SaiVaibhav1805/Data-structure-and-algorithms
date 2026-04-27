package arrays;

import java.util.Scanner;

public class leftbydplaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] temp=new int[k];
        k=k%n;
        for(int j=0;j<k;j++){
            temp[j]=arr[j];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
       for(int i=0;i<n;i++){
        System.out.println(arr[i]+"");
       }

        sc.close();
    }
}
