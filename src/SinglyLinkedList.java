public class SinglyLinkedList implements LL{
    private int size;
    NodeS head;

    public NodeS getHead() {
        return head;
    }

    public SinglyLinkedList() {
        this.size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(int val){
        NodeS newnode = new NodeS(val);
        if(isEmpty()){
            head = newnode;
        }
        else {
            NodeS temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next=newnode;
        }
        size++;
    }

    void ithDisplay(int ind){
        if (ind>=size) return;
        NodeS temp=head;
        for(int i=0;i<ind;i++){
            temp=temp.getNext();
        }
        System.out.println(temp.data);
    }

    void size_display(){
        NodeS temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        System.out.println(s);
    }
}
