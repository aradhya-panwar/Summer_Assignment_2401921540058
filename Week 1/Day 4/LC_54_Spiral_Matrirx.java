class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();


        int top = 0, bottom = matrix.length - 1,left = 0,right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // l to r
            for (int col = left; col <= right; col++) {
                ans.add(matrix[top][col]);
            }
            top++;

            // t. to b
            for (int row = top; row <= bottom; row++) {
                ans.add(matrix[row][right]);
            }
            right--;

            // r to l
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ans.add(matrix[bottom][col]);
                }
                bottom--;

            }


            // bto t
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    ans.add(matrix[row][left]);
                }
                left++;
            }
            
        }



        return ans;
    }
}
