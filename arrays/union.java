package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }

        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums1[i]);

        }
        for(int i=0;i<m;i++){
            st.add(nums2[i]);

        }
       for(int x:st){
        System.out.print(x+" ");
       }
        sc.close();

    }
}
