package algoridemo;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//≤„–Ú±È¿˙
public class ATraversedBinaryTree {
    public static  void levelTraversal(ATreeNode root){
        Queue<ATreeNode> q = new LinkedList<ATreeNode>();
        q.add(root);
        while (!q.isEmpty()){
            ATreeNode temp = q.poll();
            if (temp != null){
                System.out.println(temp.data);
                q.add(temp.leftChild);
                q.add(temp.rightChild);
            }
        }
    }

    public static void deepOrder(ATreeNode node){
        if(node == null){
            return;
        }
        Queue<ATreeNode> queue = new LinkedList<ATreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()){
            for (int i =1 ;i<= queue.size(); ++i){
                ATreeNode root = queue.poll();
                System.out.println(root.data);
                if (node.leftChild !=null){
                    queue.offer(root.leftChild);
                }
                if (node.rightChild != null){
                    queue.offer(root.rightChild);
                }
            }
        }
    }

    public static List order(ATreeNode root, int i, ArrayList list){
        if (root == null){
            return null;
        }
        int length = list.size();
        if (length <= i){
            for (int j =0;j<=i-length;j++){
                list.add(length+j,null);
            }
        }
        list.set(i,root.data);
        order(root.leftChild,2*i,list);
        order(root.rightChild,2*i+1,list);
        return list;
    }



}
