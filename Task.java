public class Task {
    private String title; // Title of the task
    private String description; // Description of the task
    private boolean completed;

    // Constructor to initialize a new task with title, description, and set completed status to false
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initially, the task is not completed
    }


    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public boolean isCompleted() {
        return completed;
    }


    public void markCompleted() {
        this.completed = true;
    }

    // Override toString method to provide a string representation of the task
    @Override
    public String toString() {
        // Concatenate title, description, and completion status (if completed)
        return title + ": " + description + (completed ? " (completed)" : "");
    }
}


