/*======================================================================================================================
 File Name   : MenuText.java
 Author      : @author Raja Umer Saghir
 Description : MenuText Class which is used to create and use the text required for menu Options.
======================================================================================================================*/

//Package declaration which containing all the files regarding the ToDO List App.
package ToDoList;


public class MenuText {

    // For welcome text for the fist and main menu.
    String welcomeText;

    // For Main menu Options text.
    String menuOptionsText;

    // For heading text for the task list.
    String taskListHeadingText;

    // For Different select option list text.
    String selectOption1;
    String selectOption2;
    String selectOption3;
    String selectOption4;
    String selectOption5;
    String selectOption6;
    String selectOption7;


    /**
     * This constructor initializes the Welcome Text, menu option text and Task List heading pre defined text with a string.
     */
    public MenuText() {
        this.welcomeText = "Welcome to the ToDoList";
        this.menuOptionsText = "Please pick one of the following Options";
        this.taskListHeadingText = "List of all Tasks with Detail";
    }

    /**
     * @param selectOption1 to set the select Option text.
     */
    public void setSelectOption1(String selectOption1) {
        this.selectOption1 = selectOption1;
    }

    /**
     * @param selectOption2 to set the select Option text.
     */
    public void setSelectOption2(String selectOption2) {
        this.selectOption2 = selectOption2;
    }

    /**
     * @param selectOption3 to set the select Option text.
     */
    public void setSelectOption3(String selectOption3) {
        this.selectOption3 = selectOption3;
    }

    /**
     * @param selectOption4 to set the select Option text.
     */
    public void setSelectOption4(String selectOption4) {
        this.selectOption4 = selectOption4;
    }

    /**
     * @param selectOption5 to set the select Option text.
     */
    public void setSelectOption5(String selectOption5) {
        this.selectOption5 = selectOption5;
    }


    /**
     * @param selectOption6 to set the select Option text.
     */
    public void setSelectOption6(String selectOption6) {
        this.selectOption6 = selectOption6;
    }

    /**
     * @param selectOption7 to set the select Option text.
     */
    public void setSelectOption7(String selectOption7) {
        this.selectOption7 = selectOption7;
    }

    /**
     * @return the value in welcomeText field.
     */
    public String getWelcomeText() {
        return welcomeText;
    }

    /**
     * @return the value in menuOptionsText field.
     */
    public String getMenuOptionsText() {
        return menuOptionsText;
    }

    /**
     * @return the value in taskListHeadingText field.
     */
    public String getTaskListHeadingText() {
        return taskListHeadingText;
    }

    /**
     * @return the value in selectOption1 field.
     */
    public String getSelectOption1() {
        return selectOption1;
    }

    /**
     * @return the value in selectOption2 field.
     */
    public String getSelectOption2() {
        return selectOption2;
    }

    /**
     * @return the value in selectOption3 field.
     */
    public String getSelectOption3() {
        return selectOption3;
    }

    /**
     * @return the value in selectOption4 field.
     */
    public String getSelectOption4() {
        return selectOption4;
    }

    /**
     * @return the value in selectOption5 field.
     */
    public String getSelectOption5() {
        return selectOption5;
    }

    /**
     * @return the value in selectOption6 field.
     */
    public String getSelectOption6() {
        return selectOption6;
    }

    /**
     * @return the value in selectOption7 field.
     */
    public String getSelectOption7() {
        return selectOption7;
    }
}

