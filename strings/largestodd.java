class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String largest="";
        String ans="";
        for(int i=0;i<n;i++){
            largest+=num.charAt(i);
            int lastDigit = largest.charAt(largest.length() - 1) - '0';            
            if(lastDigit%2!=0){
                ans=largest;
            }
        }
        return ans;
    }
}