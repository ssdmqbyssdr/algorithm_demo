package algoridemo;

import javax.swing.tree.TreeNode;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class MinDepthA {
    /**
     * 解法一：深度优先
     * 遍历整颗数，找到每一个叶子节点，从叶子节点往上开始计算，左右子节点都为空则记录深度为1
     * 左右子节点只有一边，深度记录为子节点深度+1
     * 左右两边都有子节点，则记录左右子节点的深度较小值+1
     * 时间复杂度：O(N)
     * 空间复杂度：O(logN) 取决于树的高度
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
