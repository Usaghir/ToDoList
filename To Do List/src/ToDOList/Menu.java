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

    /**
     * This method is for showing all the tasks stored by the user.
     *
     * @param tasksList will provide the Tasks and data list.
     * @param menuText will provide the text used in the menu options.
     */


    public void showTasks(ArrayList<Task> tasksList, MenuText menuText) throws FileNotFoundException {

        // File and Scanner object to open and read data from file.
        File file = new File("ToDoLis.txt");
        Scanner inputFile = new Scanner(file);

        // taskDetail is for storing and displaying all the tasks.
        String taskDetail = "";

        // For display text in case the user didn't have any task.
        if (file.length() == 0) {
            JOptionPane.showMessageDialog(null, "There is no added task");
        } else {

            // For display all the tasks with data as a String.
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

    /**
     * This method is for adding the tasks and detail.
     *
     * @param task will provide the Task object to create the Tasks.
     * @param project will provide the project object to store the data of the project.
     * @param menuText will provide the text used in the menu options.
     * @param tasksList will provide the tasks list for storing the data the data.

     */
    public void addTaskData(Task task, Project project, MenuText menuText, ArrayList<Task> tasksList) throws FileNotFoundException {


        // For future use in case the to retrieve the already stored data from the file.
        //FileWriter fileWriter = new FileWriter("ToDoLis.txt", true);

        // For opening the file to write the data to file after adding.
        PrintWriter outputFile = new PrintWriter("ToDoLis.txt");

        // For title input from user.
        String title;

        // For dueDate input from user.
        String dueDate;

        // For status input from user.
        String status;

        // For project input from user.
        String input;

        // For setting the title enter option text.
        menuText.setSelectOption1("Please enter the title of task: ");

        // For setting the due date enter option text.
        menuText.setSelectOption2("Please enter the due date of the task: ");

        // For setting the enter status option text.
        menuText.setSelectOption3("Please enter the status of the task: ");

        // For setting the project enter option text.
        menuText.setSelectOption4("Please enter the project name this task belong to");

        // For task title input from user.
        title = JOptionPane.showInputDialog(menuText.getSelectOption1());
        task.setTitle(title);

        // For task due date input from user.
        dueDate = JOptionPane.showInputDialog(menuText.getSelectOption2());
        task.setDueDate(dueDate);

        // For task status input from user.
        status = JOptionPane.showInputDialog(menuText.getSelectOption3());
        task.setStatus(status);

        // For task project name it belong input from user.
        input = JOptionPane.showInputDialog(menuText.getSelectOption4());
        project.setName(input);

        // For adding the entered tasks detail to the array list.

        tasksList.add(new Task(task.getTitle(), task.getDueDate(), task.getStatus(), new Project(project.getName())));

        // For adding the Array list of Tasks data to the file.
        for (Task tasks : tasksList) {

            outputFile.println("Task: " + tasks.getTitle());
            outputFile.println("DueDate: " + tasks.getDueDate());
            outputFile.println("Status: " + tasks.getStatus());
            outputFile.println("Project: " + tasks.getProject().getName());
        }

        // For closing the file after adding the data.
        outputFile.close();

    }

    public void editTasks(Task task, Project project, MenuText menuText, ArrayList<Task> tasksList) throws FileNotFoundException {

        // For future use in case the to retrieve the already stored data from the file.
        //FileWriter fileWriter = new FileWriter("ToDoLis.txt", true);

        // For opening the file to write the data to file after editing.
        PrintWriter outputFile = new PrintWriter("ToDoLis.txt");

        // For the user input as String.
        String input;

        // For user choice regarding the editing the task list.
        int choice;

        // For user choice which task user want to edit.
        int taskSelectChoice;

        // For User to Choose which task want to edit.
        menuText.setSelectOption4("Which Task you want to edit Choose between " + 1 + " and " + (tasksList.size() - 1));

        // Fro Task selecting menu.
        input = JOptionPane.showInputDialog(null, menuText.getSelectOption4(), "Task selecting Menu", JOptionPane.INFORMATION_MESSAGE);
        taskSelectChoice = Integer.parseInt(input);


        // For input validation in case user choose the wrong number for the task.
        while (taskSelectChoice >= tasksList.size()) {
            input = JOptionPane.showInputDialog(null, menuText.getSelectOption4(), "Invalid Choice", JOptionPane.ERROR_MESSAGE);
            taskSelectChoice = Integer.parseInt(input);
        }

        // For setting the Task editing choices text.
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

        // For getting the option selected by the user.
        choice = Integer.parseInt(input);

        // To display the error message in case the user choose the wring option.
        while (choice < 1 || choice > 5) {

            input = JOptionPane.showInputDialog(null, menuText.getMenuOptionsText() +

                    "\n\n" + menuText.getSelectOption1() +
                    "\n" + menuText.getSelectOption2() +
                    "\n" + menuText.getSelectOption3() +
                    "\n" + menuText.getSelectOption4() +
                    "\n" + menuText.getSelectOption5(), "Invalid Choice", JOptionPane.ERROR_MESSAGE);

            choice = Integer.parseInt(input);
        }

        // For different actions for editing the tasks against the choices from user.
        switch (choice) {

            case 1:

                // For displaying the current title and user input for new title.
                menuText.setSelectOption2("Current title of this Task is: ");
                menuText.setSelectOption2("Please enter the new title for the Task: ");
                input = JOptionPane.showInputDialog(menuText.getSelectOption1() + tasksList.get(taskSelectChoice).getTitle() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).setTitle(input);
                break;

            case 2:
//                do {

                // For displaying the due date and user input for new due date.
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

                // For displaying the current status and user input for new status.
                menuText.setSelectOption2("Current status of the Task is: ");
                menuText.setSelectOption2("Please enter the new status for the Task: ");

                input = JOptionPane.showInputDialog(menuText.getSelectOption2() + tasksList.get(taskSelectChoice).getStatus() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).setStatus(input);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;

            case 4:
//                do {

                // For displaying the current Project and user input for new Project detail.
                menuText.setSelectOption2("The project name of the Task is: ");
                menuText.setSelectOption2("Please enter the new project name for the Task: ");

                input = JOptionPane.showInputDialog(menuText.getSelectOption2() + tasksList.get(taskSelectChoice).getProject().getName() + "\n" + menuText.getSelectOption2());
                tasksList.get(taskSelectChoice).getProject().setName(input);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;

            case 5:

                // For removing the whole tasks.
//                do {
                tasksList.remove(taskSelectChoice);
                    /*input = JOptionPane.showInputDialog(menu.getEditMoreTaskText());

                } while (input.equals("yes"));*/
                break;

        }

        // For updating the file after editing the tasks.
        for (Task tasks : tasksList) {

            outputFile.println("Task: " + tasks.getTitle());
            outputFile.println("DueDate: " + tasks.getDueDate());
            outputFile.println("Status: " + tasks.getStatus());
            outputFile.println("Project: " + tasks.getProject().getName());
        }
        outputFile.close();
    }
}
