
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int Max =0, left = 0;
        for (int r = 0;r<s.length();r++){
            
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            Max = Math.max(Max, r-left+1);
            
        }
        return Max;
    }
}