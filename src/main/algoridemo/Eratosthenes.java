package algoridemo;

/**
 * ����ɸ
 *���������Ϊtrue��j = i * i �� 2 * i �Ż�������ϵ��2�����ű���������j += i���൱�ڵ�����ϵ��2���� ÿһ�����������������ȱ���ҪС������(0,1����)��2 * i ��Ȼ�����������������
 * ��2���������ڸ���nʱ����ʵ������Ѿ��������жϣ�����ֻ���жϺ���һ�Σ�����2������n��ʵ�� ���� i �����Ĺ������Ѿ�������ˣ�i ʵ���Ͼ��൱�ڸ���n
 * ���磺n = 25 ���������
 * 2 * 4 = 8
 * 3 * 4 = 12
 * ��ʵ����8��12�Ѿ���ǹ�����n = 17ʱ�Ѿ������� 3 * 4��2 * 4
 */
public class Eratosthenes {
    public  static  int eratosthenes(int n){
        boolean[] isPrime =new boolean[n];
        int ans =0;
        for (int i =2 ; i < n; i++){
            if(!isPrime[i]){
                ans +=1;
                for(int j = i*i;j <n ; j+=i){
                    isPrime[j] = true;
                }
            }
        }
        return ans;
    }
}
