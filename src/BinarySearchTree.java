public class BinarySearchTree {
    private Treenode root;
    public static class Treenode{
        private int data;
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
}
