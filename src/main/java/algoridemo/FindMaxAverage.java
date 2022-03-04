package algoridemo;

/**
 *���������ƽ����
 *��һ���������飬�ҳ�ƽ��������ҳ���Ϊn���±������������飬����������ƽ������
 *�����鶨��λһ���������������ƶ�ʱ�������ڵĺ͵���sum�����¼ӽ�����ֵ����ȥ��ȥ��ֵ
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
