package algoridemo;

public class FindLength {
    /**
     * �������������
     * ����һ��δ��������������飬�ҵ�������������������У������ظ����еĳ��ȡ� ���е��±���������
     * ̰���㷨
     * ��0��ʼѰ�ҵ������У��������ȼ�¼����¼�������е����һ���±꣬Ȼ��Ӹ��±����Ѱ�ң���¼ ���ȣ�ȡ�������ļ���
     * @param nums
     * @return
     */
    public static int findLength(int[] nums){
        int ans= 0;
        int start =0;
        for (int i =0 ; i<nums.length; i++){
            if ( i>0 && nums[i] <= nums[i-1]){
                start = i;
            }
            ans = Math.max(ans,i - start +1);
        }
        return ans;
    }
}
