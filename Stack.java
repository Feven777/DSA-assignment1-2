import java.util.EmptyStackException;
public class Stack {
    private Node1 top; // Top of the stack
    public void push(int data) {
        Node1 newNode = new Node1(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top; // Point the new node to the current top
            top = newNode; // Update the top to the new node
        }
    }
    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int data = top.value;
        top = top.next; // Move the top pointer to the next node
        return data; // Return the value of the popped element
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.value; // Return the value of the top node
    }

}

