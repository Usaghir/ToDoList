/*======================================================================================================================
 File Name   : Project.java
 Author      : @author Raja Umer Saghir
 Description : The Project Class to add data regarding Project belong to Tasks.
======================================================================================================================*/

//Package declaration which containing all the files regarding the To DO List App.
package ToDoList;

public class Project {

    String name;


    public Project() {
        this.name = "";
    }

    public Project(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
