class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        int i = 0;

        while(i < n){

            int cnt = 0;

            for(int j = 0; j <= i; j++){

                for(int k = 0; k <= i; k++){

                    if(A[j] == B[k]){
                        cnt++;
                        break;
                    }

                }
            }

            C[i] = cnt;

            i++;
        }

        return C;
    }
}