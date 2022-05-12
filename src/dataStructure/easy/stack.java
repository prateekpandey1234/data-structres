package dataStructure.easy;

public class stack {
    public Listnode top = null;
    public int length=0;

    public static class Listnode{
        private int data;
        private Listnode next;
        public Listnode ( int data ){
            this.data=data;
        }
    }
    public void push(int data){
        Listnode temp =  new Listnode(data);
        temp.next = top;
        top=temp;
        length++;
    }
    public static void main(String[] args){
        stack  stk = new stack();
        stk.top=new Listnode(10);
        stk.push(4);
    }
    public void pop(){
        if(length==0){
            return;
        }
        top = top.next;
        length--;
    }
}
