package arrays;

import java.util.Scanner;

public class kadane {
    static int maxSubArray(int[] nums) {
        int st=0,start=-1,end=-1;
        int sum=0,mx_sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if (sum==0){
                st=i;
            }
            sum+=nums[i];
            

            if(sum>mx_sum){
                mx_sum=sum;
                start=st;
                end=i;
            }
           

            if(sum<0)
            sum=0;
        } System.out.println("start = " + start + " end = " + end);
        for(int j=start;j<end;j++){
            System.out.print(nums[j]+" ");
        }
        return mx_sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res=maxSubArray(arr);
        System.out.println(res);
        
        sc.close();
    }
}