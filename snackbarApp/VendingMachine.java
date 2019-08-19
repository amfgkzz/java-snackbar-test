package snackbarApp;

public class VendingMachine
{
    // state - fields
    private static int maxId = 0;
    private int id;
    private String name;

    // constructor - initial state
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        
        this.name = name;
    }

    // methods - behavior - getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    // methods - behavior - setters
    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}