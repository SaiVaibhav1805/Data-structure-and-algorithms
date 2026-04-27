package binarySearch;

public class fstlstoccurence {
         int lb=lowerBound(nums,target);
        if(lb==nums.length||nums[lb]!=target) return new int[]{-1,-1};
        return new int[]{lb,upperBound(nums,target)-1};
    

    int lowerBound(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
            low=mid+1;

            }
            
        }
        return ans;
    }

        public int upperBound(int[] arr, int target) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans+1;
        }
        public static void main(String[] args) {
            
        }

}
