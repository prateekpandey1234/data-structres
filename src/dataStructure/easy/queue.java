package dataStructure.easy;

import java.util.NoSuchElementException;

public class queue {
    private Listnode front = null;
    private Listnode rear = null;
    private int length;
    private Object NoSuchElementException;

    public static class Listnode{
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
            this.next =null;
        }
    }
    public static void main(String[] args){

    }
    public void enqueue(int data){
        Listnode temp = new Listnode(data);
        if(length==0){
            front = temp;
        }else{
        rear.next = temp;}

        rear = temp;
        length++;
    }
    public int dequeue() throws Throwable {
        if(length==0){
            throw (Throwable) NoSuchElementException;
        }
        int temp = front.data;
        front = front.next;
        length--;
        return temp;
    }

}
