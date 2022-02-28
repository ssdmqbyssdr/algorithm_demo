package algoridemo;

/**
 * 删除排序数组中的重复项
 * 一个有序数组 nums ，原地删除重复出现的元素，使每个元素只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 双指针算法：
 * 数组完成排序后，我们可以放置两个指针 i 和 j，其中 i 是慢指针，而 j 是快指针。只要
 * nums[i]=nums[j]，我们就增加 j 以跳过重复项。
 * 当遇到 nums[j] ！= nums[i]时，跳过重复项的运行已经结束，必须把nums[j]）的值复制到 nums[i +
 * 1]。然后递增 i，接着将再次重复相同的过程，直到 j 到达数组的末尾为止。
 */


public class RemoveDuplicates {
    public  int removeDuplicates(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int i =0;
        for(int j =1; j<nums.length; j++){
            if(nums[j] !=nums[i]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
