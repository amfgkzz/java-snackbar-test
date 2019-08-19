package snackbarApp;

public class Info
{
    private String name;
    private String vendingMachineName;
    private int quantityOnHand;
    private double totalCost;

    public Info(String name, String vendingMachineName, int quantityOnHand, double totalCost)
    {
        this.name = name;
        this.vendingMachineName = vendingMachineName;
        this.quantityOnHand = quantityOnHand;
        this.totalCost = totalCost;
    }

    @Override
    public String toString()
    {
        String displayInfo = "name: " + name + "\n" +
            "vending machine: " + vendingMachineName + "\n" +
            "quantity on hand: " + quantityOnHand + "\n" +
            "total cost: " + totalCost;

        return displayInfo;
    }
}