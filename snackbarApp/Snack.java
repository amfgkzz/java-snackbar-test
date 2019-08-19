package snackbarApp;

public class Snack
{
    // state - fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor - initial state
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
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

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    // methods - behavior - add quantity
    public void addQuantity(int addQuantity)
    {
        this.quantity += addQuantity;
    }

    // methods - behavior - buy snack
    public int buySnack(int buySnack)
    {
        this.quantity -= buySnack;
        return buySnack;
    }

    // methods - behavior - total cost
    public double getTotalCost(int quantity)
    {
        return (cost * quantity);
    }

}