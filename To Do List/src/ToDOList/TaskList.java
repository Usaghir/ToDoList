package ToDOList;
import java.util.ArrayList;


public class TaskList

{
    ArrayList<TaskDetail> taskList;

    public TaskList()
    {
        this.taskList = new ArrayList<>();

    }

    public void setTaskList(ArrayList<TaskDetail> taskList) {
        this.taskList = taskList;
    }

    public ArrayList<TaskDetail> getTaskList() {
        return taskList;
    }
}
