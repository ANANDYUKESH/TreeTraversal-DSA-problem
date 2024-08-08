//find TreeTraversal preorder,inorder,postorder for given tree    
 //          4
    //      /\
    //     2  5
    //    /   /\
    //   3   7  6
    //   \     /
    //    9   8
    //    / 
    //   1
import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode (int value){
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversal{
    
    public static void preorder(TreeNode node){
        if(node==null)
        return;
        System.out.print(node.value+" ");//root
        preorder(node.left);//left
        preorder(node.right);//right
    }
    public  static void inorder(TreeNode node){
        if(node==null)
        return;
        inorder(node.left);//left
        System.out.print(node.value+" ");//root
        inorder(node.right);//right
    }
    public  static void postorder(TreeNode node){
        if(node==null)
        return;
        postorder(node.left);//left
        postorder(node.right);//rigth
        System.out.print(node.value+" ");//root
     }
     public  static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);
        
        TreeTraversal tree=new TreeTraversal();
        System.out.print("Preorder traversal:");
        tree.preorder(root);
        System.out.print("inorder traversal:");
        tree.inorder(root);
        System.out.print("Postorder traversal:");
        tree.postorder(root);
    }
    }
