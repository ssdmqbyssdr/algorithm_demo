package algoridemo;

import java.util.Arrays;

/**
 * Ѱ���������������
 *������ĳһ���±꣬�������ߵ�Ԫ��֮����ȣ����±꼴Ϊ��������˼·����ͳ�Ƴ�����������ܺͣ�Ȼ��ӵ�һ��Ԫ�ؿ�ʼ����
 *�ܺ͵ݼ���ǰԪ�أ����ӵ�����ǰԪ�أ�֪������ֵ���
 */
public class GetPivotIndex {
    public static int pivoIndex(int[] nums){
        int sum1 = Arrays.stream(nums).sum();
        int sum2 =0;
        for(int i =0 ; i<nums.length;i++){
            sum2 +=nums[i];
            if (sum1 == sum2){
                return i;
            }
            sum1 =sum1-nums[i];
        }
        return -1;
    }
}
