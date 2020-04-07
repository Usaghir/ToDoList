/*======================================================================================================================
 File Name   : Task.java
 Author      : @author Raja Umer Saghir
 Description : Task Class which is used to create the To Do list Tasks.
======================================================================================================================*/

//Package declaration which containing all the files regarding the ToDO List App.
package ToDoList;

public class Task
{
    // For title of the Task.
    private String title;

    // For due date of the Task.
    private String dueDate;

    // For status of the Task.
    private String status;

    // For project of the Task.
    private Project project;


    /**
     * This constructor initializes the title, due date, status, and project object.
     */
    public Task()
    {

        this.title = "";
        this.dueDate = "";
        this.status = "";
        this.project = new Project();
    }

    /**
     * This constructor initializes the title, due date, status, and project object via the parameters.
     * @param title The title of the Task
     * @param dueDate The dueDate of the Task
     * @param status The status of the Task
     * @param project The project related of the Task
     */
    public Task(String title, String dueDate, String status, Project project)
    {

        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
        this.project = project;
    }

    /**
     * @param title to set the title of the Task.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * @param dueDate to set the due Date of the Task.
     */
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }

    /**
     * @param status to set the status of the Task.
     */
    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * @param project to set the project of the Task.
     */
    public void setProject(Project project)
    {
        this.project = project;
    }

    /**
     * This getTitle method returns the title of the Task.
     * @return The value in the title field.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This getDueDate method returns the dueDate of the Task.
     * @return The value in the dueDate field.
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * This getStatus method returns the status of the Task.
     * @return The value in the status field.
     */
    public String getStatus() {
        return status;
    }

    /**
     * This getProject method returns the project of the Task.
     * @return The value in the project field.
     */
    public Project getProject() {
        return project;
    }




}



