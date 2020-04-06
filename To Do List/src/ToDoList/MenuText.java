/*======================================================================================================================
 File Name   : MenuText.java
 Author      : @author Raja Umer Saghir
 Description : MenuText Class which is used to create and use the text required for menu Options.
======================================================================================================================*/

//Package declaration which containing all the files regarding the ToDO List App.
package ToDoList;


public class MenuText {
    String welcomeText;
    String menuOptionsText;
    String taskListHeadingText;

    String selectOption1;
    String selectOption2;
    String selectOption3;
    String selectOption4;
    String selectOption5;
    String selectOption6;
    String selectOption7;

    public MenuText() {
        this.welcomeText = "Welcome to the ToDoList";
        this.menuOptionsText = "Please pick one of the following Options";
        this.taskListHeadingText = "List of all Tasks with Detail";
    }

    public void setSelectOption1(String selectOption1) {
        this.selectOption1 = selectOption1;
    }

    public void setSelectOption2(String selectOption2) {
        this.selectOption2 = selectOption2;
    }

    public void setSelectOption3(String selectOption3) {
        this.selectOption3 = selectOption3;
    }

    public void setSelectOption4(String selectOption4) {
        this.selectOption4 = selectOption4;
    }

    public void setSelectOption5(String selectOption5) {
        this.selectOption5 = selectOption5;
    }

    public void setSelectOption6(String selectOption6) {
        this.selectOption6 = selectOption6;
    }

    public void setSelectOption7(String selectOption7) {
        this.selectOption7 = selectOption7;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public String getMenuOptionsText() {
        return menuOptionsText;
    }

    public String getTaskListHeadingText() {
        return taskListHeadingText;
    }

    public String getSelectOption1() {
        return selectOption1;
    }

    public String getSelectOption2() {
        return selectOption2;
    }

    public String getSelectOption3() {
        return selectOption3;
    }

    public String getSelectOption4() {
        return selectOption4;
    }


    public String getSelectOption5() {
        return selectOption5;
    }

    public String getSelectOption6() {
        return selectOption6;
    }

    public String getSelectOption7() {
        return selectOption7;
    }
}

