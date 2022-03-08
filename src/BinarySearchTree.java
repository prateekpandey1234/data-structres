public class BinarySearchTree {
    private Treenode root;
    public static class Treenode{
        private final int data;
        private Treenode left;
        private Treenode right;
        public Treenode(int data){
            this.data=data;
            this.left= null;
            this.right = null;
        }
    }
    private static void main(String[] args){

    }
    private Treenode insert(Treenode root, Integer data) {
        Treenode temp = new Treenode(data);
        if (root == null) {
            root = temp;
            return root;
        }else{
            if(temp.data>root.data){
                root.right = insert(root.right,temp.data);
            }
            else{
                root.left=insert(root.left,temp.data);
            }
        }
        return root;
    }
    private Treenode search(Treenode root , Integer data){
        if(root==null || root.data==data){
            return root;
        }
        if(root.data>data){
             return search(root.right,data);
        }else{
            return search(root.left,data);
        }
    }
    private Boolean isValid(Treenode root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left = isValid(root.left,
                min,
                root.data);
        if(left){
            return isValid(root.right, root.data, max);
        }
        return false;
    }
    //recursive approach for checking if tree is symmetric
    public boolean isSymmetric( Treenode root){
        return isSysmmetriccheck(root.right,root.left);
    }
    private boolean isSysmmetriccheck(Treenode root1,Treenode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && isSysmmetriccheck(root1.left,root2.right) && isSysmmetriccheck(root1.right,root2.left);
    }
}