package ToDOList;
import javax.swing.JOptionPane;

public class TaskDetail
{

    String title;
    String dueDate;
    String status;
    Project project;

    public TaskDetail(String title, String dueDate, String status, Project project)
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

    public void addOptions()
    {
        String input;
        input = JOptionPane.showInputDialog("Please enter title of the task :");


    }
}



