//https://practice.geeksforgeeks.org/problems/level-order-traversal/1
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node){
     ArrayList<Integer>currlevel=new ArrayList<>();
     Queue<Node>queue=new LinkedList<>();
     queue.add(node);
     while(!queue.isEmpty()){
         Node temp=queue.poll();
         currlevel.add(temp.data);
         if(temp.left!=null){
             queue.add(temp.left);
         }
         if(temp.right!=null){
             queue.add(temp.right);
         }
     }
     return currlevel;
    }
}
