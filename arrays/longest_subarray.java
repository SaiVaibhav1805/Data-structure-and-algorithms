// package arrays;
// import java.util.HashMap;
// import java.util.Scanner;

// public class longest_subarray {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,3,1,1,1,1,4,2,3};
//         int n=arr.length;
        // int k=sc.nextInt();
    //     int length=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=arr[j];
    //             if(sum==k)
    //             {
    //                 length=Math.max(length,j-i+1);
    //             }
    //         }

    //     }
    //     System.out.println(length);
    //     sc.close();           ##BRUTE FORCE

    package arrays;
import java.util.HashMap;
import java.util.Scanner;

public class longest_subarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int n = arr.length;
        int k = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){

            sum += arr[i];

            // case 1: subarray from 0 to i
            if(sum == k){
                maxLen = i + 1;
            }

            // case 2: subarray in between
            int rem = sum - k;

            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // store first occurrence only
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
        sc.close();
    }
}
