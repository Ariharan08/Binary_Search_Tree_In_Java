import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
       Node newnode=new Node(data);
       if(root==null){
           root=newnode;
       }
       else {
           Node temp=root;
           while(true){
               if(newnode.data<temp.data){
                   if(temp.left==null){
                   temp.left=newnode;
                   break;
                  }
                  else {
                      temp=temp.left;
                  }
               }
               else if(newnode.data>temp.data){
                   if(temp.right==null){
                       temp.right=newnode;
                       break;
                   }
                   else {
                       temp=temp.right;
                   }
               }
           }
       }
    }
    void display()
    {
        System.out.println("IN ORDER : ");
        inorder(root); 
        
        System.out.println("PRE ORDER : ");
        preorder(root);
        
        System.out.println("POST ORDER : ");
        postorder(root);
        
    }
    void inorder(Node root)
    {
        if(root==null){
            return ;
        }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
    }
  
    void preorder(Node root) 
    {
        if(root==null){
            return ;
        }
     System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
    } 
   void postorder(Node root)
   {
        if(root==null){
            return ;
        }
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
    }
}
public class Binary_Search_Tree
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		BST bs=new BST();
		int n=a.nextInt();
		for(int i=0;i<n;i++){
		    bs.insert(a.nextInt());
		}
		bs.display();
	}
}
