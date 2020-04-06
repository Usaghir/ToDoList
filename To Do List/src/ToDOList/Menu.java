/*======================================================================================================================
 File Name   : Menu.java
 Author      : @author Raja Umer Saghir
 Description : Menu Class which contain all the methods required to  manipulate the To do Tasks.
======================================================================================================================*/

//Package declaration which containing all the files regarding the To DO List App.
package ToDoList;

/**
 * Swing Library to use the Graphical User Interface instead of command Line Interface.
 * Array list class to store all To DO Tasks objects.
 * Input OutPut for handling the fine not found exception.
 * Scanner for reading from the File.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Menu {

    public void showTasks(ArrayList<Task> tasksList, MenuText menuText) throws FileNotFoundException {


        File file = new File("ToDoLis.txt");
        Scanner inputFile = new Scanner(file);

        String taskDetail = "";
        if (file.length() == 0) {
            JOptionPane.showMessageDialog(null, "There is no added task");
        } else {

            {

                while (inputFile.hasNext()) {
                    // Read the next name.
                    taskDetail += inputFile.nextLine() + "\n";
                    // Display the last name read.
                    System.out.println(taskDetail);

                }


            }

            JOptionPane.showMessageDialog(null, taskDetail);
        }


    }

    public void addTaskData(Task task, Project project, MenuText menuText, ArrayList<Task> tasksList) throws FileNotFoundException {

        //FileWriter fileWriter = new FileWriter("ToDoLis.txt", true);
        PrintWriter outputFile = new PrintWriter("ToDoLis.txt");

        String title;
        String dueDate;
        String status;
        String input;

        menuText.setSelectOption1("Please enter the title of task: ");
        menuText.setSelectOption2("Please enter the due date of the task: ");
        menuText.setSelectOption3("Please enter the status of the task: ");
        menuText.setSelectOption4("Please enter the project name this task belong to");

        title = JOptionPane.showInputDialog(menuText.getSelectOption1());
        task.setTitle(title);
        dueDate = JOptionPane.showInputDialog(menuText.getSelectOption2());
        task.setDueDate(dueDate);

        status = JOptionPane.showInputDialog(menuText.getSelectOption3());
        task.setStatus(status);
        input = JOptionPane.showInputDialog(menuText.getSelectOption4());
        project.setName(input);

        tasksList.add(new Task(task.getTitle(), task.getDueDate(), task.getStatus(), new Project(project.getName())));

        for (Task tasks : tasksList) {

            outputFile.println("Task: " + tasks.getTitle());
            outputFile.println("DueDate: " + tasks.getDueDate());
            outputFile.println("Status: " + tasks.getStatus());
            outputFile.println("Project: " + tasks.getProject().getName());
        }
        outputFile.close();

        //System.exit(0);

    }

    public void editTasks(Task task, Project project, MenuText menuText, ArrayList<Task> tasksList) throws FileNotFoundException {

        //FileWriter fileWriter = new FileWriter("ToDoLis.txt", true);
        PrintWriter outputFile = new PrintWriter("ToDoLis.txt");

        String input;
        int choice;
        int taskSelectChoice;

        menuText.setSelectOption4("Which Task you want to edit Choose between " + 1 + " and " + (tasksList.size() - 1));


        input = JOptionPane.showInputDialog(null, menuText.getSelectOption4(), "Task selecting Menu", JOptionPane.INFORMATION_MESSAGE);
        taskSelectChoice = Integer.parseInt(input);


        while (taskSelectChoice >= tasksList.size()) {
            input = JOptionPane.showInputDialog(null, menuText.getSelectOption4(), "Invalid Choice", JOptionPane.ERROR_MESSAGE);
            taskSelectChoice = Integer.parseInt(input);
        }


        menuText.setSelectOption1("(1) For editing title of the Task");
        menuText.setSelectOption2("(2) For editing the due-date of the task:");
        menuText.setSelectOption3("(3) For editing the status of the task:)");
        menuText.setSelectOption4("(4) For editing the project name this task belong to");
        menuText.setSelectOption5("(5) For removing the Task");

        input = JOptionPane.showInputDialog(null, menuText.getMenuOptionsText() +

                "\n\n" + menuText.getSelectOption1() +
                "\n" + menuText.getSelectOption2() +
                "\n" + menuText.getSelectOption3() +
                "\n" + menuText.getSelectOption4() +
                "\n" + menuText.getSelectOption5(), "Task Editing Menu", JOptionPane.INFORMATION_MESSAGE);

        choice = Integer.parseInt(input);

        while (choice < 1 || choice > 5) {

            input = JOptionPane.showInputDialog(null, menuText.getMenuOptionsText() +

                    "\n\n" + menuText.getSelectOption1() +
                    "\n" + menuText.getSelectOption2() +
                    "\n" + menuText.getSelectOption3() +
                    "\n" + menuText.getSelectOption4() +
                    "\n" + menuText.getSelectOption5(), "Invalid Choice", JOptionPane.ERROR_MESSAGE);

            choice = Integer.parseInt(input);
        }

        switch (choice) {

            case 1:
                menuText.setSelectOption2("Current title of this Task is: ");
                menuText.setSelectOption2("Please enter the new title for the Task: ");
                input = JOptionPane.showInputDialog(menuText.getSelectOption1() + tasksList.get(taskSelectChoice).getTitle() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).setTitle(input);
                break;

            case 2:
//                do {
                menuText.setSelectOption2("Current due date of the Task is: ");
                menuText.setSelectOption2("Please enter the new due date for the Task: ");
                input = JOptionPane.showInputDialog(menuText.getSelectOption2() + tasksList.get(taskSelectChoice).getDueDate() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).setDueDate(input);

                   /* input = JOptionPane.showInputDialog(menu.getAddMoreTaskText());
                } while (input.equals("yes"));
                showTasks(tasksList);*/
                break;

            case 3:
//                do {

                menuText.setSelectOption2("Current status of the Task is: ");
                menuText.setSelectOption2("Please enter the new status for the Task: ");

                input = JOptionPane.showInputDialog(menuText.getSelectOption2() + tasksList.get(taskSelectChoice).getStatus() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).setStatus(input);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;

            case 4:
//                do {
                menuText.setSelectOption2("The project name of the Task is: ");
                menuText.setSelectOption2("Please enter the new project name for the Task: ");

                input = JOptionPane.showInputDialog(menuText.getSelectOption2() + tasksList.get(taskSelectChoice).getProject().getName() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).getProject().setName(input);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;

            case 5:
//                do {
                tasksList.remove(taskSelectChoice);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;


        }
        for (Task tasks : tasksList) {

            outputFile.println("Task: " + tasks.getTitle());
            outputFile.println("DueDate: " + tasks.getDueDate());
            outputFile.println("Status: " + tasks.getStatus());
            outputFile.println("Project: " + tasks.getProject().getName());
        }
        outputFile.close();
    }
}
