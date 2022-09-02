//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/0
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

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node){
     if(node==null){
         return 0;
     }
     int lheight=height(node.left);
     int rheight=height(node.right);
     return (Math.max(lheight,rheight)+1);
    }
}
