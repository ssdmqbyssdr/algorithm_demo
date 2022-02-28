package algoridemo;

import java.util.Arrays;

/**
 * 一个整型数组乘积不会越界，在数组中找出由三个数字组成的最大乘积，并输出这个乘积。
 * 如果数组中全是非负数，则排序后最大的三个数相乘即为最大乘积；如果全是非正数，则最大的三个数  相乘同样也为最大乘积。
 * 如果数组中有正数有负数，则最大乘积既可能是三个最大正数的乘积，也可能是两个最小负数（即绝对  值最大）与最大正数的乘积。
 * 分别求出三个最大正数的乘积，以及两个最小负数与最大正数的乘积，二者之间的最大值即为所求答  案
 */

public class MaxProduct {
    /**
     * 解法一：排序
     */
    public static int sort(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n-1], nums[n-3] * nums[n-2] * nums[n-1] );
    }

    /**
     * 解法一：线性扫描
     */

    public static int getMaxMin(int[] nums){
        int min1 = 0,min2 = 0;
        int max1 =0 ,max2 = 0, max3 = 0;
        for (int x:nums){
            if(x < min1){
                min2 =min1;
                min1 = x;
            }else if (x < min2){
                min2 = x;
            }
            if (x > max1){
                max3 =max2;
                max2 = max1;
                max1 =x;
            }else if (x > max2){
                max3 = max2;
                max2 = x;
            }else if (x > max3){
                max3= x;
            }
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}
