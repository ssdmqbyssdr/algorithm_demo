package algoridemo;

//�ݹ����

public class ATraversBinaryTree {

    /**
     * ������ǰ�����   ��-> ��-> ��
     * @param node    �������ڵ�
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
     * �������������   ��-> ��-> ��
     * @param node   �������ڵ�
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

