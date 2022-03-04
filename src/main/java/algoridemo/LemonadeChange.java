package algoridemo;

/**
 *������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��
 * �˿��Ŷӹ�����Ĳ�Ʒ��һ�ι���һ����
 * ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��
 * �����ÿ���˿���ȷ����ע�⣬һ��ʼ����ͷû���κ���Ǯ��
 * ������ܸ�ÿλ�˿���ȷ���㣬���� true �����򷵻� false ��
 *
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills){
        int five =0;
        int ten =0;
        for (int bill:bills){
            if (bill == 5){
                five++;
            }else if (bill == 10){
                if (five == 0){
                    return false;
                }
                five--;
                ten++;
            }else {
                if(five >0 && ten >0){
                    five--;
                    ten--;
                }else if (five>=3){
                    five -=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
