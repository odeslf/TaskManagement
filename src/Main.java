public class Main {
    public static void main(String[] args) {

        TaskManager<Task> taskManager = new TaskManager<>();

        Task emailTask = new EmailTask("Enviar relatório",
                "Relatório semanal para cliente", 1);

        Task emailTask2 = new EmailTask("Reunião",
                "Lembrete de Reunião", 2);

        Task reportTask = new ReportTask("Gerar Relatório",
                "Relatório financeiro do mês", 1);

        taskManager.addTask(emailTask);
        taskManager.addTask(emailTask2);
        taskManager.addTask(reportTask);

        System.out.println("Executanto todas as tarefas:");
        taskManager.executeAllTasks();

        taskManager.displayTasksByPriority(1);

    }
}