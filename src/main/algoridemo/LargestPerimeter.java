package algoridemo;


import java.util.Arrays;

/**
 * �����ε�����ܳ�
 * ������һЩ�����������ȣ���ɵ�����  A ����������������������ɵġ������Ϊ��������ε�����ܳ���
 * ��������γ��κ������Ϊ��������Σ����� 0 ��̰�ģ�
 * ��С�������򣬼������������±꣬�����������ǵ����ڶ��͵����±꣬���ʱ�������ܳ����
 * n < (n-1) + (n-2)���������������ζ�Ÿ������в���������������ֵ֮�ʹ���n����ʱ��n���ƣ����¼���
 */

public class LargestPerimeter {
    public int largestPerimeter(int[] Ang){
        Arrays.sort(Ang);
        for(int i = Ang.length; i>= 2; --i){
            if (Ang[i-2] + Ang[i-1] > Ang[i]){
                return Ang[i-2] + Ang[i-1] + Ang[i];
            }
        }
        return 0;
    }
}
