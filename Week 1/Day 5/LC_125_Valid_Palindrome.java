


    class Solution {
    public boolean isPalindrome(String s) {
        int left =0,right = s.length()-1;
        while(left<=right){
            char l = s.charAt(left),r=s.charAt(right);
            if (!Character.isLetterOrDigit(l)){
                left++;
                continue;}
            if (!Character.isLetterOrDigit(r)){
                right--;
                continue;
            }
            if (Character.toLowerCase(l) == Character.toLowerCase(r)){
                left++;right--; 
                continue;
            }
            else{
                return false;
            }
        



            }
            return true;
        }
    }

