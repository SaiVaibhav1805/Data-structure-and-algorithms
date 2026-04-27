package arrays;

import java.util.Scanner;

public class largest{


public static int largestele(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int[] arr=new int[k];
    for(int i=0;i<k;i++){
        arr[i]=sc.nextInt();
    }
int result=largestele(arr);
System.out.println(result);
sc.close();
}

}