package algoridemo;

/**
 * ɾ�����������е��ظ���
 * һ���������� nums ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹÿ��Ԫ��ֻ����һ�� ������ɾ����������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 *
 * ˫ָ���㷨��
 * ���������������ǿ��Է�������ָ�� i �� j������ i ����ָ�룬�� j �ǿ�ָ�롣ֻҪ
 * nums[i]=nums[j]�����Ǿ����� j �������ظ��
 * ������ nums[j] ��= nums[i]ʱ�������ظ���������Ѿ������������nums[j]����ֵ���Ƶ� nums[i +
 * 1]��Ȼ����� i�����Ž��ٴ��ظ���ͬ�Ĺ��̣�ֱ�� j ���������ĩβΪֹ��
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
