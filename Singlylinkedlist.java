public class Singlylinkedlist {
    Node1 head;

    public Singlylinkedlist(){
        this.head=null;
    }

    void append(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node1 current=head;
        while(current.next!=null){ // Traverse to the end of the list
            current=current.next;
        }
        current.next=newNode; // Set the next of the last node to the new node
    }

    public Node1 searchNode(int value) {
        Node1 current = head;
        while (current != null) {
            if (current.value == value) {
                return current; // Return the node if found
            }
            current = current.next;
        }
        return null;
    }

    public void deleteAfterNode(Node1 givenNode){
        if(givenNode!=null||givenNode.next!=null) {
            Node1 nextNode = givenNode.next;
            givenNode.next = nextNode.next;
            nextNode.next = null;
        }
        return;
    }

    public void deleteAtpos(int position){
        if(head==null){
            return;
        }
        if(position==0){
            head=head.next; // If position is 0, delete the head node
        }
        Node1 temp=head;
        for(int i=0;temp!=null&&i<position-1;i++){ // Traverse to the node before the position
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            return; // If position is out of bounds, or next node is null, nothing to delete
        }
        temp.next=temp.next.next; // Link the node before the position to the node after the position
    }

    public void insertAtPos(int position,int data){
        Node1 newNode=new Node1(data);
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node1 temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){return;} // If position is out of bounds, do nothing
        newNode.next=temp.next;
        temp.next=newNode;
    }


    void display(){
        Node1 current=head;
        while(current!=null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }

}

