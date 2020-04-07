/*======================================================================================================================
 File Name   : Project.java
 Author      : @author Raja Umer Saghir
 Description : The Project Class to add data regarding Project belong to Tasks.
======================================================================================================================*/

//Package declaration which containing all the files regarding the To DO List App.
package ToDoList;

public class Project {

    private String name;                    //For storing the Name of the Project.


    // Constructor to initialize the name of the Project with empty String.
    public Project() {
        this.name = "";
    }

    /**
     * Constructor to initialize the name of the Project with parameter.
     * @param name the name of the Project.
     */
    public Project(String name) {
        this.name = name;
    }

    /**
     * @param name set the name of the project.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the value of the name field of the project.
     */
    public String getName() {
        return name;
    }
}
