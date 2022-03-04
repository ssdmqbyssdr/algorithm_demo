package algoridemo;


import java.util.Arrays;

/**
 * 三角形的最大周长
 * 给定由一些正数（代表长度）组成的数组  A ，返回由其中三个长度组成的、面积不为零的三角形的最大周长。
 * 如果不能形成任何面积不为零的三角形，返回 0 。贪心：
 * 先小到大排序，假设最长边是最后下标，另外两条边是倒数第二和第三下标，则此时三角形周长最大
 * n < (n-1) + (n-2)，如果不成立，意味着该数组中不可能有另外两个值之和大于n，此时将n左移，重新计算
 */

public class LargestPerimeter {
    public int largestPerimeter(int[] Ang){
        Arrays.sort(Ang);
        for(int i = Ang.length; i>= 2; --i){
            if (Ang[i-2] + Ang[i-1] > Ang[i]){
                return Ang[i-2] + Ang[i-1] + Ang[i];
            }
        }
        return 0;
    }
}
