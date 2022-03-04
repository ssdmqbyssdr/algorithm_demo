package algoridemo;

public class SqrtFunction {
    /**
     * �ڲ�ʹ�� sqrt(x) ����������£��õ� x��ƽ��������������
     * �ⷨһ�����ֲ���
     * x��ƽ�����϶���0��x֮�䣬ʹ�ö��ֲ��Ҷ�λ�����֣������ֵ�ƽ��һ������ӽ�x�ģ�mƽ��ֵ�������x����������ң����С�ڵ���x�����ұ���
     * �ҵ�0��X�����м����m��
     * ���m * m > x����mȡx/2��x���м����֣�ֱ��m * m < x��m��Ϊƽ��������������
     * ���m * m <= x����ȡ0��x/2���м�ֵ��֪�����ߵĽ����غϣ��ҵ�������������Ϊxƽ��������������
     * ʱ�临�Ӷȣ�O(logN)
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
     * �ⷨ����ţ�ٵ���
     * ����ƽ������ i ���� i �� x/i ��Ȼ����x�����ӣ��� x/i ��Ȼ���� i ���Ƶ��� i + x / i = 2 * i���ó� i = (i + x / i) / 2
     *
     * �ɴ˵ó��ⷨ��i ������ѡһ��ֵ��ֻҪ������ʽ������i ��Ȼ����x��ƽ����������������� (i + x / i) /
     * 2�ó���ֵ���еݹ飬ֱ���ó���ȷ��
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
