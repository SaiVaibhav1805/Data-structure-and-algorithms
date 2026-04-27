package arrays;

import java.util.ArrayList;

public class leaders {
     int n = arr.length;
        ArrayList<Integer> lst = new ArrayList<>();
        int max=arr[n-1];  //or 0
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                lst.add(arr[i]);
            }
        }
    Collections.reverse(lst);
        return lst ;
    

}



       