//https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1
class BinaryTree
{
    static int sumBT(Node head){
      if(head==null){
          return 0;
         
      }
      int sum=0;
      sum+=head.data;
       sum+=sumBT(head.left);
       sum+=sumBT(head.right);
      return sum;
    }
}

/*
explanation:

      sumBT (Node head(1)){
        if (head == null) {
            return 0;
        }
        int sum = 0;
        sum += head.data;  ------>sum=1
        sum += sumBT(head.left); ---------------------> return by left=11  total sum=1+11+3=15
        sum += sumBT(head.right); it will return 3 to left
        return sum;
    }                                                              (2)
                                                             sumBT (Node head (2)){
                                                             if (head == null) {
                                                                 return 0;
                                                                       }
                                                         int sum = 0;
                                                        sum += head.data; ---> sum=2
                                  return 4 <--------------sum += sumBT(head.left); // total 2+4+5=11
                                                       sum += sumBT(head.right);-->right part call similarly root=5 and return to left 0+5=5
                                                            return sum;
                                                             }
               (3)
   sumBT (Node head(4)){
        if (head == null) {
            return 0;
        }
        int sum = 0;
        sum += head.data;  ------>sum=4
        sum += sumBT(head.left); ---------------------> return =0, sum=4+0=4--->after that right will be call it will return 0 ,sum=0+4+0=4
        sum += sumBT(head.right);
        return sum;
    }

                                                                     (4)
                                                             sumBT (Node head (null)){
                                                             if (head == null) { // this execute and return 0;
                                                                 return 0;
                                                                       }
                                                            int sum = 0;
                                                            sum += head.data;
                                                            sum += sumBT(head.left);
                                                            sum += sumBT(head.right);
                                                            return sum;
                                                             }



    so total sum=15
*/
