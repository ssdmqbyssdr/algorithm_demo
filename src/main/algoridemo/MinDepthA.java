package algoridemo;

import javax.swing.tree.TreeNode;

/**
 * ����һ�����������ҳ�����С��ȡ�
 * ��С����ǴӸ��ڵ㵽���Ҷ�ӽڵ�����·���ϵĽڵ�������
 */
public class MinDepthA {
    /**
     * �ⷨһ���������
     * �������������ҵ�ÿһ��Ҷ�ӽڵ㣬��Ҷ�ӽڵ����Ͽ�ʼ���㣬�����ӽڵ㶼Ϊ�����¼���Ϊ1
     * �����ӽڵ�ֻ��һ�ߣ���ȼ�¼Ϊ�ӽڵ����+1
     * �������߶����ӽڵ㣬���¼�����ӽڵ����Ƚ�Сֵ+1
     * ʱ�临�Ӷȣ�O(N)
     * �ռ临�Ӷȣ�O(logN) ȡ�������ĸ߶�
     * @param root
     * @return
     */
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.getChildCount() >= 1){
            return 1;
        }
        int mind_depth = Integer.MAX_VALUE;
//        if (root.left != null){
//            mind_depth = Math.min(minDepth(root.left),mind_depth);
//        }
        return mind_depth + 1;
    }
}
