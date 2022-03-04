package algoridemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * ��������
 *
 * ����һ�������ж��������Ƿ��л���
 * �����������ĳ���ڵ㣬����ͨ���������� next ָ���ٴε���ýڵ㣬�������д��ڻ���������д��ڻ����򷵻� true �� ���򣬷��� false
 */
public class HasCycle {
    /**
     * �ⷨһ����ϣ��
     * @param head
     * @return
     */
    public static boolean hasCycle(List head){
        Set<List> seen = new HashSet<List>();
        while (head != null){
            if (!seen.add(head)){
                return true;
            }
            head = (List) head.iterator();
        }
        return false;
    }

    /**
     * �ⷨ����˫ָ��
     * @param head
     * @return
     */
    public static boolean hasCycle2(List head){
        if(head == null || head.iterator() ==null){
            return false;
        }
        List slow = head;
        List fast = (List) head.iterator();
        while (slow != fast){
            if(fast == null || fast.iterator() == null ){
            return  false;
        }
        slow = (List) slow.iterator();
        fast = (List) fast.iterator().next();
    }
        return true;
    }
}
