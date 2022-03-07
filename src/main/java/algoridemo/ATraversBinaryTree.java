package algoridemo;

//递归遍历

public class ATraversBinaryTree {

    /**
     * 二叉树前序遍历   根-> 左-> 右
     * @param node    二叉树节点
     */
    public  static void preOrderTraveral(ATreeNode node){
        if (node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    /**
     * 二叉树中序遍历   左-> 根-> 右
     * @param node   二叉树节点
     */
    public static void inOrderTraveral(ATreeNode node){
        if(node == null){
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.println(node.data);
        inOrderTraveral(node.rightChild);
    }

    public static void postOrderTraveral(ATreeNode node){
        if(node == null){
            return;
        }
        inOrderTraveral(node.leftChild);
        inOrderTraveral(node.rightChild);
        System.out.println(node.data);

    }


}

