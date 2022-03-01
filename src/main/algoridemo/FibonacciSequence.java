package algoridemo;

/**
 * ��ȡ쳲��������е�Nλ��ֵ��
 * 쳲��������У�ÿһλ��ֵ������ǰ��λ����֮�͡�ǰ��λ�̶� 0��1,1,2,3,5,8��������
 */
public class FibonacciSequence {
    /**
     * �ⷨһ�������ݹ�
     */
    public static int calculate(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return calculate(num-1)+calculate(num-2);
    }

    /**
     * �ⷨ����ȥ�صݹ�
     * �ݹ�ó�������ֵ֮�󡢴洢��һ������(�±��������±�һ��)������ݹ�֮ǰ�ȵ��ü��ϲ�ѯһ�Σ�
     * ����鵽������ݹ顢ֱ��ȡֵ���鲻���ٽ��еݹ����
     */
    public static int calculate2(int num){
        int[] arr = new int[num+1];
        return recurse(arr ,num);
    }
    private static int recurse(int[] arr, int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        if(arr[num] != 0){
            return arr[num];
        }
        arr[num] = recurse(arr,num -1) +recurse(arr,num-2);
        return arr[num];
    }

    /**
     * �ⷨ����˫ָ�����
     * ����ȥ�صݹ��Ż�������û�б�Ҫ����ÿһ���±�ֵ��ֻ�豣��ǰ��λ���ɣ����������ó�N��ֵ
     */

    public static int iterate(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        int low = 0,high =1;
        for (int i =2 ; i<= num; i++){
            int sum = low + high;
            low = high;
            high = sum;
        }
        return high;
    }
}
