public class ToDoList {

    private Node2 head;

    public ToDoList() {
        head = null;
    }

    // Method to add a new task to the to-do list
    public void addToDo(Task task) {
        Node2 newNode = new Node2(task); // Create a new node with the given task
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Update the head to the new node
    }

    // Method to mark a task as completed given its title
    public void markToDoAsCompleted(String title) {
        Node2 current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                if (!current.task.isCompleted()) {
                    current.task.markCompleted(); // Mark the task as completed
                    System.out.println("Task '" + title + "' marked as completed.");
                } else {
                    System.out.println("Task '" + title + "' is already completed.");
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found");
    }

    // Method to view the entire to-do list
    public void viewToDoList() {
        Node2 current = head;
        while (current != null) {
            System.out.println(current.task + " "); // Print the task information
            current = current.next; // Move to the next node
        }
        System.out.println();
    }
}






