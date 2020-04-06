/*======================================================================================================================
 File Name   : Task.java
 Author      : @author Raja Umer Saghir
 Description : Task Class which is used to create the To Do list Tasks.
======================================================================================================================*/

//Package declaration which containing all the files regarding the ToDO List App.
package ToDoList;

public class Task
{

    String title;
    String dueDate;
    String status;
    Project project;


    public Task()
    {

        this.title = "";
        this.dueDate = "";
        this.status = "";
        this.project = new Project();
    }

    public Task(String title, String dueDate, String status, Project project)
    {

        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
        this.project = project;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public void setProject(Project project)
    {
        this.project = project;
    }

    public String getTitle() {
        return title;
    }
    public String getDueDate() {
        return dueDate;
    }
    public String getStatus() {
        return status;
    }
    public Project getProject() {
        return project;
    }




}



