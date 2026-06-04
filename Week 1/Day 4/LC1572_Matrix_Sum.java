class Solution {
    public int diagonalSum(int[][] mat) {
        int Sum= 0;
        int n =mat.length;
        for (int i =0;i<n;i++){
            for (int j =0;j<n;j++){
                if (i==j){
                    Sum+= mat[i][i];

                    continue;
                }
                else if(i+j ==n-1){
                    Sum+=mat[i][j];
                }

                

            }
        }
        return Sum;
        
    }
}
