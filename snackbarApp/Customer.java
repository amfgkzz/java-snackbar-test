package snackbarApp;

public class Customer
{
    // state - fields
    private static int maxId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private double cash;

    // constructor - initial state
    public Customer(String firstName, String lastName, double cash)
    {
        maxId++;
        id = maxId;
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
    }

    // methods - behavior - getters
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public double getCash()
    {
        return cash;
    }

    // methods - behavior - setters
    public void setName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addCash(double addCash)
    {
        this.cash += addCash;
    }

    public void useCash(double useCash)
    {
        this.cash -= useCash;
    }
}