import java.util.Stack;

public class BinaryTree {
    private Treenode root;
    public static class Treenode{
        private int data;
        private Treenode left;
        private Treenode right;
        public Treenode(int data){
            this.data=data;
            this.left =  null;
            this.right = null;
        }
    }
    public void craete(){
        Treenode frst=new Treenode(1);
        Treenode secd=new Treenode(2);
        Treenode thrd=new Treenode(3);
        Treenode frth=new Treenode(4);
        Treenode fith=new Treenode(5);
        Treenode sixh=new Treenode(6);
        Treenode sevh=new Treenode(7);

        root = frst;
        root.left=secd;
        root.right=thrd;
        secd.left = frth;
        secd.right = fith;
        thrd.left=sixh;
        thrd.right = sevh;
    }
    public static void main(String[] args){
        BinaryTree  sll = new BinaryTree();
        sll.craete();
        sll.traverse(sll.root);
    }
    public void tera(Treenode root){
        if(root==null){
            return;
        }
        Stack<Treenode> stck = new Stack<>();
        stck.push(root);
        while(!stck.isEmpty()){
            Treenode temp = stck.pop();
            if(temp.right!=null){
                stck.push(temp.right);
            }
            if(temp.left!=null){
                stck.push(temp.left);
            }
        }
    }
    public void traverse(Treenode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        traverse(root.left);
        traverse(root.right);
    }
}
