import java.util.Scanner;

public class count_inversions {

    public static int invert(int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j] && i<j){
                    count++;
                }

            }
            
        }
        return count;


  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=invert(arr,n);
        System.out.println(result);
        
        sc.close();

    }
}
