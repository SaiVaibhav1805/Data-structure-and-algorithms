class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> mapp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer idx_s=map.get(s.charAt(i));
            Integer idx_t=mapp.get(t.charAt(i));
            if(idx_s!=idx_t && (idx_s==null || !idx_s.equals(idx_t))){
                return false;
            }
            map.put(s.charAt(i),i);
            mapp.put(t.charAt(i),i);
        }
        return true;
    }
}