package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityII {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr={1,1,1,1,3,2,2,2,2};
    int n=arr.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0 )+1);
    }
    for(int x:map.keySet()){
        if(map.get(x)>n/3){
            System.out.print(x+" ");
        }
    }
    sc.close();
    }                 //BETTER SOLUTION
                //OPTIMAL IN LEETOCODE
    
    
}
