import java.util.ArrayList;
import java.util.List;

public class TaskManager<T extends Task> implements Manageable<T> {

    private List<T> taskList = new ArrayList<>();

    @Override
    public void addTask(T task) {
        taskList.add(task);
    }

    @Override
    public List<T> getTasksByPriority(int priority) {

        List<T> tasksWithPriority = new ArrayList<>();
        for (T task : taskList) {
            if (task.getTaskPriority() == priority) {
                tasksWithPriority.add(task);
            }
        }
        return tasksWithPriority;
    }

    @Override
    public void executeAllTasks() {

        for (T task : taskList) {
            task.executeTask();
        }
    }

    public void displayTasksByPriority(int priority) {

        List<T> tasks = getTasksByPriority(priority);
        if (tasks.isEmpty()) {
            System.out.println("Não há tarefas com a prioridade " + priority);
        } else {
            System.out.println("\nTarefas com prioridade " + priority + ":");
            for (T task : tasks) {
                System.out.println("Título: " + task.taskName + ", Descrição: " + task.taskDescription);
            }
        }
    }
}
