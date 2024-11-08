import java.util.List;

public interface Manageable<T> {

    void addTask(T task);
    List<T> getTasksByPriority(int priority);
    void executeAllTasks();
}
