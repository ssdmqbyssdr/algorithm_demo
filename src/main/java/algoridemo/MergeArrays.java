package algoridemo;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * 两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */
public class MergeArrays {
    /**
     * 解法一：合并后排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void  mergeArrays(int[] nums1,int m,int[] nums2, int n){
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }


    /**
     * 解法二：双指针	从前往后
     * 将两个数组按顺序进行比较，放入新的数组
     * 时间复杂度 : O(n + m)。
     * 空间复杂度 : O(m)。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeArrays2(int[] nums1,int m,int[] nums2, int n){
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1 = 0, //指向数组1的拷贝
                p2 = 0, //指向数组2
                p = 0; //指向数组1

        //将数组1当成空数组，比较数组1的拷贝和数组2，将较小的放入空数组
        while ((p1<m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] :nums2[p2++];

        //数组2和数组1不等长，将多出的元素拷贝
        if (p1 < m)
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
        if (p2 < n)
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
    }

    /**
     * 解法三：双指针优化从后往前
     * 时间复杂度 : O(n + m)。
     * 空间复杂度 : O(1)。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeArrays3(int[] nums1,int m,int[] nums2, int n){
        int p1 = m-1;
        int p2 = n -1;
        int p = m + n -1;

        while ((p1 >= 0) && (p2 >= 0))
            nums1[p--] =nums1[p1]< nums2[p2] ? nums2[p2--] :nums1[p1--];
        System.arraycopy(nums2,0,nums1,0,p2+1);
        }

}
