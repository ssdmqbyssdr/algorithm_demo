package algoridemo;

import java.util.LinkedList;

public class ATreeNode {
        public int data;
        public ATreeNode leftChild;
        public ATreeNode rightChild;

        public ATreeNode(int data){
            this.data = data;
        }

        /**
         * 构建二叉树
         * @param list   输入序列
         * @return
         */
        public static ATreeNode createBinaryTree(LinkedList<Integer> list){
            ATreeNode node = null;
            if(list == null || list.isEmpty()){
                return null;
            }
            Integer data = list.removeFirst();
            if(data!=null){
                node = new ATreeNode(data);
                node.leftChild = createBinaryTree(list);
                node.rightChild = createBinaryTree(list);
            }
            return node;
        }
    }

