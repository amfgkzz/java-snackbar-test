package snackbarApp;

public class Main {
    public static void customerShoppingExperience() {
        // vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drinks");
        VendingMachine office = new VendingMachine("Office");

        // customers
        Customer jane = new Customer("Jane", "Xiong", 45.25);
        Customer bob = new Customer("Bob", "Vang", 33.14);

        // snacks in food vending machine
        Snack chips = new Snack("Lays", 36, 1.75, food.getId());
        Snack bar = new Snack("Snickers", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Diamonds", 30, 2.00, food.getId());

        // snacks in drink vending machine
        Snack soda = new Snack("Pepsi", 24, 2.50, drink.getId());
        Snack water = new Snack("Dasani", 20, 2.75, drink.getId());

        // Display snack information
        Info firstSnack = new Info(chips.getName(), food.getName(), chips.getQuantity(),
                chips.getTotalCost(chips.getQuantity()));
        Info secondSnack = new Info(bar.getName(), food.getName(), bar.getQuantity(),
                bar.getTotalCost(bar.getQuantity()));
        Info thirdSnack = new Info(pretzel.getName(), food.getName(), pretzel.getQuantity(),
                pretzel.getTotalCost(pretzel.getQuantity()));
        Info fourthSnack = new Info(soda.getName(), drink.getName(), soda.getQuantity(),
                soda.getTotalCost(soda.getQuantity()));
        Info fifthSnack = new Info(water.getName(), drink.getName(), water.getQuantity(),
                water.getTotalCost(water.getQuantity()));

        // Jane buys 3 sodas
        System.out.println("Jane's total amount in her wallet: " + jane.getCash());
        System.out.println("*** Jane buys 3 sodas ***");
        jane.useCash(soda.getTotalCost(soda.buySnack(4)));
        System.out.println("Amount left of soda in drink vending machine: " + soda.getQuantity());
        System.out.println("Amount left in Jane's wallet: " + jane.getCash());

        System.out.println();

        // Jane buys 1 pretzel
        System.out.println("Jane's total amount in her wallet: " + jane.getCash());
        System.out.println("*** Jane buys 1 pretzel ***");
        jane.useCash(pretzel.getTotalCost(pretzel.buySnack(1)));
        System.out.println("Amount left of pretzel in food vending machine: " + pretzel.getQuantity());
        System.out.println("Amount left in Jane's wallet: " + jane.getCash());

        System.out.println();

        // Bob buys two sodas
        System.out.println("Bob's total amount in his wallet: " + bob.getCash());
        System.out.println("*** Bob buys two sodas ***");
        bob.useCash(soda.getTotalCost(soda.buySnack(2)));
        System.out.println("Amount left of sodas in drink vending machine: " + soda.getQuantity());
        System.out.println("Amount left in Bob's wallet: " + bob.getCash());

        System.out.println();

        // Jane finds 10 dollars and adds it to her wallet
        System.out.println("*** Jane finds 10 dollars and adds it to her wallet ***");
        jane.addCash(10);
        System.out.println("Amount in Jane's wallet: " + jane.getCash());

        System.out.println();

        // Jane buys One bar
        System.out.println("Amount in Jane's wallet: " + jane.getCash());
        System.out.println("*** Jane buys one chip ***");
        jane.useCash(bar.getTotalCost(bar.buySnack(1)));
        System.out.println("Amount left of bar in food vending machine: " + bar.getQuantity());
        System.out.println("Amount left in Jane's wallet: " + jane.getCash());

        System.out.println();

        // Add 12 more items to pretzels
        System.out.println("Amount of pretzels currently: " + pretzel.getQuantity());
        System.out.println("*** Add 12 more items to pretzels ***");
        pretzel.addQuantity(4);
        System.out.println("Amount left of pretzels in food vending machine: " + pretzel.getQuantity());

        System.out.println();

        // Bob buys 3 pretzels
        System.out.println("Amount left in Bob's wallet: " + bob.getCash());
        System.out.println("*** bob buys 3 pretzels ***");
        bob.useCash(pretzel.getTotalCost(pretzel.buySnack(3)));
        System.out.println("Amount left in Bob's wallet: " + bob.getCash());
        System.out.println("Amount of pretzels left: " + pretzel.getQuantity());

        System.out.println();

        // All snacks with name, vending machine name, quantity on hand, total cost of
        // all on the quantities of this snack on hand
        System.out.println(firstSnack);

        System.out.println();

        System.out.println(secondSnack);

        System.out.println();

        System.out.println(thirdSnack);

        System.out.println();

        System.out.println(fourthSnack);

        System.out.println();

        System.out.println(fifthSnack);

    }

    public static void main(String[] args) {
        customerShoppingExperience();
    }
}