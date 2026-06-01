public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int i=0, j ;
        for ( i=0;i<nums.length-1;i++){
                int n1= nums[i];
            for (j=i+1;j<nums.length;j++ ){
                if (n1+nums[j]==target)
                    return new int[]{i,j};
                
            }
        }
        return new int[]{};
    }
}

