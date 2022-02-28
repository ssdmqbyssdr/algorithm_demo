package algoridemo;

public class SqrtFunction {
    /**
     * 在不使用 sqrt(x) 函数的情况下，得到 x的平方根的整数部分
     * 解法一：二分查找
     * x的平方根肯定在0到x之间，使用二分查找定位该数字，该数字的平方一定是最接近x的，m平方值如果大于x、则往左边找，如果小于等于x则往右边找
     * 找到0和X的最中间的数m，
     * 如果m * m > x，则m取x/2到x的中间数字，直到m * m < x，m则为平方根的整数部分
     * 如果m * m <= x，则取0到x/2的中间值，知道两边的界限重合，找到最大的整数，则为x平方根的整数部分
     * 时间复杂度：O(logN)
     */
    public static int binarySrearch(int x){
        int l=0,r=x,index =-1;
        while (l <= r){
            int mid = 1+(r-l)/2;
            if((long)mid *mid <=x){
                index = mid;
                l = mid+1;
            }
            else {
                r = mid - 1;
            }
        }
        return index;
    }

    /**
     * 解法二：牛顿迭代
     * 假设平方根是 i ，则 i 和 x/i 必然都是x的因子，而 x/i 必然等于 i ，推导出 i + x / i = 2 * i，得出 i = (i + x / i) / 2
     *
     * 由此得出解法，i 可以任选一个值，只要上述公式成立，i 必然就是x的平方根，如果不成立， (i + x / i) /
     * 2得出的值进行递归，直至得出正确解
     */

    public static int newton(int x){
        if(x==0)
            return 0;
        return ((int)(sqrts(x,x)));
    }

    public static double sqrts(double i,int x){
        double res = (i + x/i ) /2;
        if (res == i) {
            return i;}
        else {
            return sqrts(res,x);
        }
    }
}
