package algoridemo;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 给定一个升序排列的整数数组 numbers ，从数组中找出两个数满足相加之和等于目标数 target 。
     * 假设每个输入只对应唯一的答案，而且不可以重复使用相同的元素。
     * 返回两数的下标值，以数组形式
     *
     * @param nums
     * @param target
     * @return
     *
     * 返回暴力解法
     * 时间复杂度：O(N的平方)
     * 空间复杂度：O(1)
     */
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        for(int i = 0;i < n; ++i){
            for(int j=i+1;j<n;++j){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希表：将数组的值作为key存入map，target - num作为key
     * 时间复杂度：O(N)
     * 空间复杂度：O(N)
     */
    public int[] twoSumHash(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length;++i){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

}
