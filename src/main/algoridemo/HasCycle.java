package algoridemo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 环形链表
 *
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达该节点，则链表中存在环如果链表中存在环，则返回 true 。 否则，返回 false
 */
public class HasCycle {
    /**
     * 解法一：哈希表
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
     * 解法二：双指针
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
