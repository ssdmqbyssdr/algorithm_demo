package algoridemo;

public class FindLength {
    /**
     * 最长连续递增序列
     * 给定一个未经排序的整数数组，找到最长且连续递增的子序列，并返回该序列的长度。 序列的下标是连续的
     * 贪心算法
     * 从0开始寻找递增序列，并将长度记录，记录递增序列的最后一个下标，然后从该下标继续寻找，记录 长度，取长度最大的即可
     * @param nums
     * @return
     */
    public static int findLength(int[] nums){
        int ans= 0;
        int start =0;
        for (int i =0 ; i<nums.length; i++){
            if ( i>0 && nums[i] <= nums[i-1]){
                start = i;
            }
            ans = Math.max(ans,i - start +1);
        }
        return ans;
    }
}
