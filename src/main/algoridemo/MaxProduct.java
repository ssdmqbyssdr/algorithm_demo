package algoridemo;

import java.util.Arrays;

/**
 * һ����������˻�����Խ�磬���������ҳ�������������ɵ����˻������������˻���
 * ���������ȫ�ǷǸ������������������������˼�Ϊ���˻������ȫ�Ƿ�������������������  ���ͬ��ҲΪ���˻���
 * ����������������и����������˻��ȿ�����������������ĳ˻���Ҳ������������С������������  ֵ�������������ĳ˻���
 * �ֱ����������������ĳ˻����Լ�������С��������������ĳ˻�������֮������ֵ��Ϊ�����  ��
 */

public class MaxProduct {
    /**
     * �ⷨһ������
     */
    public static int sort(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n-1], nums[n-3] * nums[n-2] * nums[n-1] );
    }

    /**
     * �ⷨһ������ɨ��
     */

    public static int getMaxMin(int[] nums){
        int min1 = 0,min2 = 0;
        int max1 =0 ,max2 = 0, max3 = 0;
        for (int x:nums){
            if(x < min1)
        }
    }
}
