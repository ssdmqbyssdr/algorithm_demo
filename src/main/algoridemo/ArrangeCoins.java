package algoridemo;

/**
 * ����Ӳ��
 *
 * �ܹ��� n öӲ�ң������ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�����һ������ n���ҳ����γ����������е���������
 * n ��һ���Ǹ�������������32λ�з������͵ķ�Χ��
 */
public class ArrangeCoins {
    /**
     * �ⷨһ������
     * �ӵ�һ�п�ʼ���У�����һ�С�����ʣ��Ӳ�������ŵڶ��У�ֱ��ʣ��Ӳ����С�ڻ��������
     * @param n
     * @return
     */
    public  static int arrangeCoins(int n){
        for(int i =1; i <= n; i++){
            n = n-i;
            if(n <= i){
                return i;
            }
        }
        return 0;
    }

    /**
     * �ⷨ�������ֲ���
     * �������� n �У����� n ����Ҫ����Ӳ������������� n������ n/2�У��ټ���Ӳ������ n �Ĵ�С��ϵ
     * @param n
     * @return
     */
    public static int arrangeCoins2(int n){
        int low = 0,high = n;
        while (low <= high){
            long mid =(high - low) /2 + low;
            long cost = ((mid + 1) * mid) / 2;
            if(cost == n){
                return (int) mid;
            }else if (cost > n){
                high = (int)mid -1;
            }else {
                low = (int) (mid +1);
            }
        }
        return high;
    }

    /**
     * �ⷨ����ţ�ٵ���
     * ʹ��ţ�ٵ�����ƽ������(x + n/x)/2
     * �������� x �� �� 1 + 2 + 3 + ...+ x = n���� x(x+1)/2 = n �Ƶ��� x = 2n - x
     * @param x
     * @param n
     * @return
     */
    public  static  double sqrts(double x, int n){
        double res = (x + (2*n-x) / x) / 2;
        if (res == x){
        return x;
        }else {
            return sqrts(res,n);
        }
    }
}
