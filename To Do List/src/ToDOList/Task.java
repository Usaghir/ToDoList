package ToDOList;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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



