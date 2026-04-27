import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            lst.add(generateRow(i));
        }
        
        return lst;
    }


    public List<Integer> generateRow(int rowidx){
        List<Integer> row=new ArrayList<>();
       
        int ans=1;
        row.add(ans);
        for(int col=1;col<rowidx;col++){
            ans=ans*(rowidx-col);
            ans=ans/col;
            row.add(ans);
        }
        return row;
    }
}