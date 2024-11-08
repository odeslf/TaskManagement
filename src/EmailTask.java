public class EmailTask extends Task{

    public EmailTask(String taskName, String taskDescription, int taskPriority) {
        super(taskName, taskDescription, taskPriority);
    }

    @Override
    void executeTask() {
        System.out.println("Enviando e-mail...");
        System.out.println("Assunto: " + this.taskName);
        System.out.println("Descrição: " + this.taskDescription);
        System.out.println("E-mail enviado com sucesso!");
        System.out.println("-".repeat(30));
    }
}
