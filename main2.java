public class main2 {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Task task1 = new Task("study", "I have to study applied exam is near");
        Task task2 = new Task("walk pony", "I haven't taken her out this week");
        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.viewToDoList();
        toDoList.markToDoAsCompleted("Task 1");
        toDoList.viewToDoList();
    }
}




