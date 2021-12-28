public class DoublyLinkedList {
    private Listnode head;
    private Listnode tail;
    private int length;

    public static void main(String[] args){
        DoublyLinkedList sll = new DoublyLinkedList();
        sll.insert(4);;
        sll.insert(6);
        sll.insert(3);
        sll.insert(8);
        sll.insert(10);

        sll.displayfrwd();
//        sll.displaybkwd();

        sll.insertnodestart(8);
//        sll.displayfrwd();

        sll.insertany(69,3);
//        sll.displayfrwd();

        sll.delfirst();
        sll.displayfrwd();


        sll.delany(3);
        sll.displayfrwd();
    }
    private static class Listnode{
        private int data;
        private Listnode next=null;
        private Listnode previous=null;
        public Listnode(int data){
            this.data=data;
        }
    }
    public DoublyLinkedList() {
        this.head=null;
        this.tail=null;
        this.length= 0;
    }
    public void insert(int data){
        Listnode node= new Listnode(data);
        if(head==null){
            head=node;
        }
        else{
            tail.next=node;
        }
        node.previous=tail;
        tail=node;
        length++;
    }
    public void displayfrwd(){
        Listnode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void displaybkwd(){
        Listnode temp = tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }
    public void insertnodestart(int data){
        Listnode temp = new Listnode(data);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            head.previous=temp;
            head=temp;
        }
    }
    public void insertany(int data , int pos){
        Listnode temp = new Listnode(data);
        Listnode point=head;
        int x=1;
        if (pos==1){
            insertnodestart(data);
            return;
        }
        while(x<pos){
            point=point.next;
            x++;
        }
        temp.previous=point.previous;
        point.previous.next=temp;
        point.previous=temp;
        temp.next=point;
    }
    public void delfirst(){
        Listnode temp = head.next;
        head.next.previous=null;
        head.next=null;
        head=temp;
    }
    public void delany(int pos){
        Listnode curr=head;
        int x = 1;
        while(x<pos){
            curr=curr.next;
            x++;
        }
        curr.previous.next=curr.next;
        curr.next.previous=curr.previous;
        curr.previous=null;
        curr.next=null;

    }
}

