package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class majority {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i = 0; i < n; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // find majority element
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                System.out.println("Majority element = " + key);
                sc.close();
                return;
            }
        }

        System.out.println("No majority element");
        sc.close();
    }
}