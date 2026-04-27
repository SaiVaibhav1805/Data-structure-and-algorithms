package arrays;

public class dutch_nat {

    public static void main(String[] args) {

        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){

            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }

            else if(arr[mid] == 1){
                mid++;
            }

            else{ // arr[mid] == 2
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

        // print array
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}