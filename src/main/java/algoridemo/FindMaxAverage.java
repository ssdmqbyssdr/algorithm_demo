package algoridemo;

/**
 *子数组最大平均数
 *给一个整数数组，找出平均数最大且长度为n的下标连续的子数组，并输出该最大平均数。
 *将数组定义位一长串窗户，窗口移动时，窗口内的和等于sum加上新加进来的值，减去出去的值
 */
public class FindMaxAverage {
    public double findMaxAverage(int[] nums,int n){
        int sum =0;
        int m = nums.length;
        for (int i =0; i < n; i++){
            sum +=nums[i];
        }
        int maxSum = sum;
        for (int i =n ; i < m; i++){
            sum = sum - nums[i -n] + nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return 1.0 * maxSum /n ;
    }
}
