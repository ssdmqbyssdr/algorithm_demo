package algoridemo;

import javax.swing.tree.TreeNode;
import java.awt.geom.QuadCurve2D;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 解法二：广度优先
 * 从上往下，找到一个节点时，标记这个节点的深度。查看该节点是否为叶子节点，如果是直接返回深度
 * 如果不是叶子节点，将其子节点标记深度(在父节点深度的基础上加1)，再判断该节点是否为叶子节点
 * 时间复杂度：O(N)
 * 空间复杂度：O(N)
 * */
class QueueNode {
    TreeNode node;
    int depth;

    public QueueNode(TreeNode node, int depth){
        this.node = node;
        this.depth = depth;
    }
}

public class MinDepthB{
    public int minDepthB(TreeNode root){
        if(root == null){
            return 0;
        }
        Queue<QueueNode> queue = new LinkedList<QueueNode>();
        queue.offer(new QueueNode(root,1));
        while (!queue.isEmpty()){
            QueueNode nodeDepth = queue.poll();
            TreeNode node = nodeDepth.node;
            int depth = nodeDepth.depth;
//            if(node.left == null && node.right == null){
//                return depth;
//            }
//            if (node.left != null){
//                queue.offer(new QueueNode(node.left,depth+1));
//            }
//            if (node.right != null){
//                queue.offer(new QueueNode(node.right,depth+1));
//            }
        }
        return 0;
    }

}
