public class ReportTask extends Task{

    public ReportTask(String taskName, String taskDescription, int taskPriority) {
        super(taskName, taskDescription, taskPriority);
    }

    @Override
    void executeTask() {
        System.out.println("Relatório: ");
        System.out.println("Assunto: " + this.taskName);
        System.out.println("Descrição: " + this.taskDescription);
        System.out.println("-".repeat(30));
    }
}
