class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
    // for(int i = 0; i < n; i++) {
    //         for(int j = i + 1; j < n; j++) {
    //             for(int k = j + 1; k < n; k++) {
    // if(nums[i] + nums[j] + nums[k] == 0) {

    //                     List<Integer> rows = new ArrayList<>();
    //                     rows.add(nums[i]);
    //                     rows.add(nums[j]);
    //                     rows.add(nums[k]);

    //                     Collections.sort(rows);

    //                     if(!lst.contains(rows)) {
    //                         lst.add(rows);
    //                     }
    //                 }
    //             }
    //         }
    //     }

    for(int i=0;i<n;i++){
        Set<Integer> st=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int third=-(nums[i]+nums[j]);
            if(st.contains(third)){
                List<Integer> temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(third);
                Collections.sort(temp);
                set.add(temp);
            }
            st.add(nums[j]);
        }
    }

        return new ArrayList<>(set);
    }
}