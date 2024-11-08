public abstract class Task {

    protected String taskName;
    protected String taskDescription;
    protected int taskPriority;

    abstract void executeTask();

    public Task(String taskName, String taskDescription, int taskPriority) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
    }

    public int getTaskPriority() {
        return taskPriority;
    }
}
