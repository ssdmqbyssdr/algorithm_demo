package algoridemo;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * ����һ���������е��������� numbers �����������ҳ��������������֮�͵���Ŀ���� target ��
     * ����ÿ������ֻ��ӦΨһ�Ĵ𰸣����Ҳ������ظ�ʹ����ͬ��Ԫ�ء�
     * �����������±�ֵ����������ʽ
     *
     * @param nums
     * @param target
     * @return
     *
     * ���ر����ⷨ
     * ʱ�临�Ӷȣ�O(N��ƽ��)
     * �ռ临�Ӷȣ�O(1)
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
     * ��ϣ���������ֵ��Ϊkey����map��target - num��Ϊkey
     * ʱ�临�Ӷȣ�O(N)
     * �ռ临�Ӷȣ�O(N)
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
