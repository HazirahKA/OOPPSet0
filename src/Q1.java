import javax.swing.*;

public class Q1 {
    public static void main(String[] args)
    {
        String name, className, snacksQuantityAsString;
        int snacksQuantity, amount=0;

        name = JOptionPane.showInputDialog("Enter your name: ");
        className = JOptionPane.showInputDialog("Enter your class name: ");

        snacksQuantityAsString = JOptionPane.showInputDialog("Quantity of snacks? ");
        snacksQuantity = Integer.parseInt(snacksQuantityAsString);

        amount = snacksQuantity*2;

        JOptionPane.showMessageDialog(null,"Nme: " + name + "\nClass name: " + className +
                                      "\nSnacks quantity: " + snacksQuantity + "\nTotal amount: EUR" + amount, "Snacks Deal!",
                                       JOptionPane.INFORMATION_MESSAGE);
    }
}
