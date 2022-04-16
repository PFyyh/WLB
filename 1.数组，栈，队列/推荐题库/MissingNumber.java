class MissingNumber {
    public static int missingNumber(int[] nums) {
      int i = 0;
      int j = nums.length - 1;
      //边界[i,j]
        while (i <= j) {
            int m = (i + j) / 2;
          //如果m==nums[m] 说明左边齐的。答案在右边
            if (m == nums[m]) {
                i = m + 1;
              //如果不等于，必定在左边
            } else if(m<nums[m]){
                j = m - 1;
            }
        }
        return i;
    }
}