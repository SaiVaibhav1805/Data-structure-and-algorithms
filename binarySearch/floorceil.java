package binarySearch;

import java.util.Scanner;

public class floorceil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        int floor=0;
        int ceil=0;

        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]<=target){
                floor=arr[mid];
                left=mid+1;
            }
            else{
                ceil=arr[mid];
                right=mid-1;
            }
        }
        System.out.println("Floor Value"+ floor + "Ceiling Value" + ceil);
        sc.close();
    }
}
