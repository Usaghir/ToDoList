package ToDOList;


public class Menu {
    String welcomeText;
    String mainMenuOptionsText;

    String taskMenuShowText;
    String taskMenuAddText;
    String taskMenuEditText;
    String taskMenuSaveExitText;

    String taskNameText;
    String taskDueDateText;
    String taskStatusText;
    String taskProjectText;


    public Menu() {
        this.welcomeText = "Welcome to the ToDo app";

    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public void setMainMenuOptionsText(String mainMenuOptionsText) {
        this.mainMenuOptionsText = mainMenuOptionsText;
    }

    public void setTaskMenuShowText(String taskMenuShowText) {
        this.taskMenuShowText = taskMenuShowText;
    }

    public void setTaskMenuAddText(String taskMenuAddText) {
        this.taskMenuAddText = taskMenuAddText;
    }

    public void setTaskMenuEditText(String taskMenuEditText) {
        this.taskMenuEditText = taskMenuEditText;
    }

    public void setTaskMenuSaveExitText(String taskMenuSaveExitText) {
        this.taskMenuSaveExitText = taskMenuSaveExitText;
    }

    public void setTaskNameText(String taskNameText) {
        this.taskNameText = taskNameText;
    }

    public void setTaskDueDateText(String taskDueDateText) {
        this.taskDueDateText = taskDueDateText;
    }

    public void setTaskStatusText(String taskStatusText) {
        this.taskStatusText = taskStatusText;
    }

    public void setTaskProjectText(String taskProjectText) {
        this.taskProjectText = taskProjectText;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public String getMainMenuOptionsText() {
        return mainMenuOptionsText;
    }

    public String getTaskMenuShowText() {
        return taskMenuShowText;
    }

    public String getTaskMenuAddText() {
        return taskMenuAddText;
    }

    public String getTaskMenuEditText() {
        return taskMenuEditText;
    }

    public String getTaskMenuSaveExitText() {
        return taskMenuSaveExitText;
    }

    public String getTaskNameText() {
        return taskNameText;
    }

    public String getTaskDueDateText() {
        return taskDueDateText;
    }

    public String getTaskStatusText() {
        return taskStatusText;
    }

    public String getTaskProjectText() {
        return taskProjectText;
    }
}

