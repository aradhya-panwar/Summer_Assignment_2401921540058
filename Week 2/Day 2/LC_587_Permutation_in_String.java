class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1>n2){
            return false;
        }
        int[] s1_freq = new int[26];
        int[] s2_window = new int[26];
        for (int i =0;i<n1;i++){
            s1_freq[s1.charAt(i)-'a']++;
            s2_window[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(s1_freq,s2_window)){
            return true;
        }
        for (int r =n1;r<n2;r++){
            s2_window[s2.charAt(r)-'a']++;
            s2_window[s2.charAt(r-n1)-'a']--;
            if (Arrays.equals(s1_freq,s2_window)){
            return true; 
        }
        

        }


return false;
    }
}