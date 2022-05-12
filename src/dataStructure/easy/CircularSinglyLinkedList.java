package dataStructure.easy;

public class CircularSinglyLinkedList {
    private Listnode last;
    public static class Listnode{
        private int data;
        private Listnode next=null;
        public Listnode(int data){
            this.data=data;
        }
    }
    public void create(){
        Listnode first = new Listnode(1);
        Listnode second = new Listnode(15);
        Listnode third = new Listnode(25);
        Listnode fourth = new Listnode(35);
        Listnode fifth = new Listnode(45);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;

        last=fifth;

    }
    public static void main(String[] args){

    }

}
