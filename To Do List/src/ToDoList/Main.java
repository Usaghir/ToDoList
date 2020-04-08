/**
 * =====================================================================================================================
 * File Name   : Main.java
 * Author      : @author Raja Umer Saghir
 * Description : This is the main Class for our To Do List App
 * =====================================================================================================================
 */

//Package declaration which containing all the files regarding the ToDO List App.
package ToDoList;

/**
 * Swing Library to use the Graphical User Interface instead of command Line Interface.
 * Array list class to store all To DO Tasks objects.
 * Input OutPut for handling Input OutPut exception.
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.IOException;

/**
 * The main class for staring the ToDO app.
 */
public class Main {

    /**
     * Main method where the To Do App will start.
     * Thrown exception text to avoid the file input output exception.
     */

    public static void main(String[] args) throws IOException {

        // For String input from the GUI.
        String input;

        // For User choice.
        int choice;

        // For keeping the count of the Total added Tasks.
        int totalTasks = 0;

        // Created MenuText Object for creating the Menu Text.
        MenuText menuText = new MenuText();

        // Created Task Object for creating all the  Tasks.
        Task task = new Task();

        // Created Project Object for creating the Project and detail regarding the Project.
        Project project = new Project();

        // Created ArrayList Object for saving all the Task Objects.
        ArrayList<Task> tasksList = new ArrayList<>();

        // Created Menu Object for manipulating Tasks and showing Menu.
        Menu menu = new Menu();

        // For User Choice to see the Main menu again.
        do {

            // For setting the main menu  display text with list of options and input from user.
            menuText.setSelectOption1("(1) Show all the tasks");
            menuText.setSelectOption2("(2) Add new task");
            menuText.setSelectOption3("(3) Edit task");
            menuText.setSelectOption4("(4) Save and quit");

            input = JOptionPane.showInputDialog(null, menuText.getWelcomeText() +
                    "\n\n" + "You have total " + totalTasks + " tasks in your todo List" +
                    "\n" + menuText.getMenuOptionsText() +

                    "\n\n" + menuText.getSelectOption1() +
                    "\n" + menuText.getSelectOption2() +
                    "\n" + menuText.getSelectOption3() +
                    "\n" + menuText.getSelectOption4() + "\n", "Main Menu", JOptionPane.INFORMATION_MESSAGE);

            choice = Integer.parseInt(input);

            // For Error Message window in case of invalid Choice from user.
            while (choice < 1 || choice > 4) {
                input = JOptionPane.showInputDialog(null,
                        "\n" + menuText.getMenuOptionsText() +

                                "\n\n" + menuText.getSelectOption1() +
                                "\n" + menuText.getSelectOption2() +
                                "\n" + menuText.getSelectOption3() +
                                "\n" + menuText.getSelectOption4() + "\n", "Invalid Choice ", JOptionPane.ERROR_MESSAGE);

                //For User choice input.
                choice = Integer.parseInt(input);
            }

            // To Do List action method after user Choose some option from the list.
            switch (choice) {
                case 1:

                    // In case user Want to Show th Task List.
                    menu.showTasks(tasksList, menuText);
                    break;

                case 2:
                    do {

                        // In case user Want to Add th Task List.
                        menu.addTaskData(task, project, menuText, tasksList);

                        //For keeping count of the total number of Tasks.
                        totalTasks++;

                        // In case user want to another Task after finishing the previous.
                        menuText.setSelectOption5("IF you want to add more tasks enter yes otherwise enter any other text:");
                        input = JOptionPane.showInputDialog(menuText.getSelectOption5());

                    } while (input.equals("yes"));

                    // Call to display method so user can see the tasks which he added.
                    menu.showTasks(tasksList, menuText);
                    break;

                case 3:

                    // In case the User is going to Edit the Tasks before adding any Tasks.
                    if (tasksList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "There is not current task to edit so please add some tasks first");
                    } else {
                        do {

                            // Edit Method Call if the user want to Edit Task detail.
                            menu.editTasks(task, project, menuText, tasksList);

                            menuText.setSelectOption6("If you want to edit more tasks please enter yes otherwise press enter any other text: ");
                            input = JOptionPane.showInputDialog(menuText.getSelectOption6());

                        } while (input.equals("yes"));
                        menu.showTasks(tasksList, menuText);
                    }
                    break;

                case 4:

                    // To show user confirmation in case he just want to save the written data to file and quit.
                    JOptionPane.showMessageDialog(null, "All the tasks are saved and Application will Quit", "GoodBye", JOptionPane.INFORMATION_MESSAGE);
                    break;

            }
            menuText.setSelectOption7("Want to use to main menu again enter yes otherwise press enter any other text: ");
            input = JOptionPane.showInputDialog(menuText.getSelectOption7());
        } while (input.equals("yes"));

        System.exit(0);

    }
}
