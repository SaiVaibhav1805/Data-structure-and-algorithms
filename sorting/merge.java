package sorting;

import java.util.Scanner;

public class merge{
    public static void merging(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int index=0;

        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp[index]=arr[left];
                left++;
            }
            else{
                temp[index]=arr[right];
                right++;
            }
            index++;
        }

        while(left<=mid){
            temp[index]=arr[left];
            left++;
            index++;
        }

        while(right<=high){
            temp[index]=arr[right];
            right++;
            index++;
        }

        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }

    public static void mergesort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int mid=(low+high)/2;

        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merging(arr,low,mid,high);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergesort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(" ");
            }
        }

        sc.close();
    }
}