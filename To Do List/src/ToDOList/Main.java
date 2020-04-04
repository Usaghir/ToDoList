
package ToDOList;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void addTaskData(Task task, Project project, Menu menu) {

        String title;
        String dueDate;
        String status;
        String input;

        menu.setTaskNameText("Please enter title of the task: ");
        menu.setTaskDueDateText("Please enter the due-date of the task: ");
        menu.setTaskStatusText("Please enter the status of the task: ");
        menu.setTaskProjectText("Please enter the project name this task belong to");


        title = JOptionPane.showInputDialog(menu.getTaskNameText());
        task.setTitle(title);
        dueDate = JOptionPane.showInputDialog(menu.getTaskDueDateText());
        task.setDueDate(dueDate);
        status = JOptionPane.showInputDialog(menu.getTaskStatusText());
        task.setStatus(status);
        input = JOptionPane.showInputDialog(menu.getTaskProjectText());
        project.setName(input);
        System.exit(0);

    }

    public static void showTasks(ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no task");
        } else {
            for (Task taskList : tasks) {
                JOptionPane.showMessageDialog(null, taskList.getTitle() +
                        "\n" + taskList.getDueDate() +
                        "\n" + taskList.getStatus() +
                        "\n" + taskList.getProject().getName());
            }
        }
        System.exit(0);
    }

    public static void editTasks() {

        public void updateTask(){
            System.out.println();
        }

        public void removeTask(){
            System.out.println();
        }

        public void statusChangeTask(){
            System.out.println();
        }




    }


    public static void main(String[] args) {
        String input;
        int choice;

        Menu menu = new Menu();
        menu.setWelcomeText("Welcome to the ToDo app");
        menu.setMainMenuOptionsText("Please pick one of the following Options");

        menu.setTaskMenuShowText("(1) Show Task List (by date or project)");
        menu.setTaskMenuAddText("(2) Add New Task");
        menu.setTaskMenuEditText("(3) Edit Task (update, mark as done, remove)");
        menu.setTaskMenuSaveExitText("(4) Save and Quit");

        input = JOptionPane.showInputDialog(menu.getWelcomeText() +
                "\n" + "You have " + 0 + " tasks todo and " + 0 + " tasks are done!" +
                "\n" + menu.getMainMenuOptionsText() +

                "\n\n" + menu.getMainMenuOptionsText() +
                "\n" + menu.getTaskMenuAddText() +
                "\n" + menu.getTaskMenuEditText() +
                "\n" + menu.getTaskMenuSaveExitText());

        choice = Integer.parseInt(input);

        Task task = new Task();
        Project project = new Project();
        ArrayList<Task> tasks = new ArrayList<>();


        switch (choice) {
            case 1:
                showTasks(tasks);
                break;

            case 2:
                do {
                    addTaskData(task, project, menu);
                    tasks.add(new Task(task.getTitle(), task.getDueDate(), task.getStatus(), new Project(project.getName())));

                    input = JOptionPane.showInputDialog("want to add more put yes");
                } while (input.equals("yes"));
                break;

            case 3:
                do {
                    editTasks();
                    input = JOptionPane.showInputDialog("want to Edit more put yes");

                } while (input.equals("yes"));
                break;

            case 4:
                System.out.println("Saved and Quited");
                break;
        }
        System.exit(0);

    }
}
