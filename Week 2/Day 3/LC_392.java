class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m =t.length();
        int count = 0;
        if(count==n){
                return true;}
        for (int i = 0; i<m;i++){ 
            
            if (s.charAt(count)==t.charAt(i)){
                count++;
            }
            if(count==n){
                return true;}
            
        }
    return false;
    }
}