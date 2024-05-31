import java.util.Stack;
public class main1 {
    public static void main(String[] args) {
        Singlylinkedlist list= new Singlylinkedlist();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        int searchValue = 4;
        Node1 foundNode = list.searchNode(searchValue); // Searching for a node with value 4
        if (foundNode != null) {
            System.out.println("Node with value " + searchValue + " found.");
        } else {
            System.out.println("Node with value " + searchValue + " not found.");
        }
        list.display();
        list.insertAtPos(3,7); // Inserting a new node with value 7 at position 3
        list.display(); // Displaying the linked list after insertion
        list.deleteAtpos(3); // Deleting the node at position 3
        list.display(); // Displaying the linked list after deletion
        Node1 nodeToRemoveAfter = list.head.next; // Node with value 3
        list.deleteAfterNode(nodeToRemoveAfter); // Deleting the node after node with value 3
        System.out.print("List after deleting node after " + nodeToRemoveAfter.value + ": ");
        list.display(); // Displaying the linked list after deletion
        Stack<Integer> newStack=new Stack(); // Creating a new stack
        newStack.push(11);
        newStack.push(22);
        newStack.push(33);
        newStack.push(44);

        newStack.peek();
        newStack.pop();
        for(Integer element:newStack){
            System.out.print(element+" ");
        }

    }
}

