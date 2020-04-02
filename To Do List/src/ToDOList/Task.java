package ToDOList;

public class Task
{
    int taskNumber;
    TaskDetail detail;


    public Task()
    {
        this.taskNumber = 0;
        this.detail = new TaskDetail();

    }

    public void setDetail(TaskDetail detail) {
        this.detail = detail;
    }

    public int getTaskNumber() {
        return taskNumber;
    }
}
