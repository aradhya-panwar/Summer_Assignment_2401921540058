class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (m>n){
            return ans;
        }
        int[] pfreq = new int[26];
        int[] window = new int[26];
        for( int i =0; i <m;i++){
            pfreq[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;

        }
        if (Arrays.equals(pfreq,window)){
            ans.add(0);
        }
        for(int right = m;right<n;right++){
            window[s.charAt(right)-'a']++;
            window[s.charAt(right-m)-'a']--;

            if (Arrays.equals(window,pfreq)){
                ans.add(right-m+1);
            }
        }
        return ans;
    }
}