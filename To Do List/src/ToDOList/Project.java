package ToDOList;

public class Project {

    String name;


    public Project ()
    {
        this.name = "";
    }

    public Project (String name)
    {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
