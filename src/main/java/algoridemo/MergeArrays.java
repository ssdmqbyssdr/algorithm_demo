package algoridemo;

import java.util.Arrays;

/**
 * �ϲ�������������
 *
 * ���������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ nums1 ��Ϊһ���������顣
 * ��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n ������ nums1 �Ŀռ��С���� m + n�������������㹻�Ŀռ䱣������ nums2 ��Ԫ�ء�
 */
public class MergeArrays {
    /**
     * �ⷨһ���ϲ�������
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void  mergeArrays(int[] nums1,int m,int[] nums2, int n){
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }


    /**
     * �ⷨ����˫ָ��	��ǰ����
     * ���������鰴˳����бȽϣ������µ�����
     * ʱ�临�Ӷ� : O(n + m)��
     * �ռ临�Ӷ� : O(m)��
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeArrays2(int[] nums1,int m,int[] nums2, int n){
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1 = 0, //ָ������1�Ŀ���
                p2 = 0, //ָ������2
                p = 0; //ָ������1

        //������1���ɿ����飬�Ƚ�����1�Ŀ���������2������С�ķ��������
        while ((p1<m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] :nums2[p2++];

        //����2������1���ȳ����������Ԫ�ؿ���
        if (p1 < m)
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
        if (p2 < n)
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
    }

    /**
     * �ⷨ����˫ָ���Ż��Ӻ���ǰ
     * ʱ�临�Ӷ� : O(n + m)��
     * �ռ临�Ӷ� : O(1)��
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeArrays3(int[] nums1,int m,int[] nums2, int n){
        int p1 = m-1;
        int p2 = n -1;
        int p = m + n -1;

        while ((p1 >= 0) && (p2 >= 0))
            nums1[p--] =nums1[p1]< nums2[p2] ? nums2[p2--] :nums1[p1--];
        System.arraycopy(nums2,0,nums1,0,p2+1);
        }

}
