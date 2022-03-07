package algoridemo;



import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//µü´ú±éÀú
public class ATraversingBinarytree {

    public static void preOrderTraveralWithStack(ATreeNode node){

        if (node != null){
            Stack<ATreeNode> stack = new Stack<ATreeNode>();
            stack.add(node);
            while (!stack.isEmpty()){
                node = stack.pop();
                if (node !=null){
                    System.out.println(node.data);
                    stack.push(node.rightChild);
                    stack.push(node.leftChild);
                }
            }
        }
    }

    public  static void inOrderTraveralWithStack(ATreeNode node){
        if (node !=null){
            Stack<ATreeNode> stack = new Stack<ATreeNode>();
            stack.add(node);
            while ( !stack.isEmpty() || node!=null){
                if (node != null){
                stack.push(node);
                node=node.leftChild;
                }else {
                    node=stack.pop();
                    System.out.println(node.data);
                    node=node.rightChild;
                }
            }
        }
    }

    public  static void postOrderTraveralWithStack(ATreeNode node){
        if (node ==null){
            return;
        }

        Deque<ATreeNode> stack = new LinkedList<ATreeNode>();
        ATreeNode prev = null;
        while (node != null || !stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node = node.leftChild;
            }
            node = stack.pop();
            if (node.rightChild == null || node.rightChild ==prev){
                System.out.println(node.data);
                prev = node;
                node = null;
            }else {
                stack.push(node);
                node =node.rightChild;
            }
        }
    }
}
