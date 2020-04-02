
package ToDOList;
import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void addTasks()
    {
        TaskDetail task = new TaskDetail("","","",new Project("raja"));
        String title;
        String dueDate;
        String status;
        String input;
        Project project = new Project("raja");

        title = JOptionPane.showInputDialog("Please enter title of the task :");
        task.setTitle(title);
        dueDate = JOptionPane.showInputDialog("Please enter due date of the task :");
        task.setDueDate(dueDate);
        status = JOptionPane.showInputDialog("Please enter status of the task :");
        task.setStatus(status);
        input = JOptionPane.showInputDialog("Please enter project related to the task :");
        project.setName(input);

        TaskList taskList = new TaskList();

        ArrayList<TaskDetail> tasks = new ArrayList<>();
        tasks.add(new TaskDetail(task.getTitle(), task.getDueDate(),task.getStatus(),new Project(project.getName())));
        taskList.setTaskList(tasks);
    }


    public static void showTasks()
    {
        TaskList taskList = new TaskList();
        JOptionPane.showMessageDialog(null,"task Name: "+);
    }

    public static void editTasks()
    {

    }



    public static void main(String[] args)
    {
        String input;


        int choice;

        JOptionPane.showMessageDialog(null,"Welcome to the ToDOList");
        JOptionPane.showMessageDialog(null,"You have X tasks todo and Y tasks are done!");
        input = JOptionPane.showInputDialog("Pick an option:" );

        JOptionPane.showMessageDialog(null,"(1) Show Task List (by date or project)");
        JOptionPane.showMessageDialog(null,"(2) Add New Task");
        JOptionPane.showMessageDialog(null,"(3) Edit Task (update, mark as done, remove)");
        JOptionPane.showMessageDialog(null,"(4) Save and Quit");

        choice = Integer.parseInt(input);


      switch (choice)
      {
          case 1:
              System.out.println("show added task ");
              break;

          case 2:
              do
                  {
                      addTasks();
                      input = JOptionPane.showInputDialog("want to add more put yes" );
                  }while(input.equals("yes");

              break;

          case 3:
              do
                  {
                      editTasks();
                      input = JOptionPane.showInputDialog("want to Edit more put yes" );

                  }while(input.equals("yes");
              break;

          case 4:
              System.out.println("Saved and Quited");
              break;
      }











        //input = JOptionPane.showInputDialog("please enter number of packages :");



    }
}
