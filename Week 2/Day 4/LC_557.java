class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        int n = words.length;
        StringBuilder sb = new StringBuilder(n);
        for (int i =0;i<n;i++){
            StringBuilder temp = new StringBuilder(words[i]);
            sb.append(temp.reverse());
            if(i!=n-1){
                sb.append(" ");
            }
            
        }
        return sb.toString();
        

    }
}