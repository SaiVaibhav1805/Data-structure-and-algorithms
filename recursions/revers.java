package recursions;

public class revers {
    
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void rev(int i, int arr[], int n) {
        if (i >= n / 2)
            return;
        swap(arr, i, n - i - 1);
        rev(i + 1, arr, n);
    }

    public static void main(String[] args) {
        revers obj = new revers();
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        
   
        for (int x : arr)
            System.out.print(x + " \n");

        obj.rev(0, arr, n);

        for (int x : arr)
            System.out.print(x + " \n");
    }
}
