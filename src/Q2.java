import javax.swing.*;

public class Q2 {
    public static void main(String args[])
    {
        String fName, initial, lName, distanceAsString;
        int distance, remaining;
        float amount=0;

        fName = JOptionPane.showInputDialog("Enter your first name: ");
        initial = JOptionPane.showInputDialog("Enter your initial: ");
        lName = JOptionPane.showInputDialog("Enter your last name: ");

        distanceAsString = JOptionPane.showInputDialog("The distance cycled: ");
        distance = Integer.parseInt(distanceAsString);

        if(distance <= 10)
        {
            amount = distance*0.07f;
        }
        else
        {
            remaining = distance - 10;

            amount = (remaining*0.10f)+(10*0.07f);
        }

        JOptionPane.showMessageDialog(null,"Full name: " + fName + " " + initial + " " + lName +
                "\nDistance cycled: " + distance + "km \nMoney due: EUR" + amount, "Cyclist Information",JOptionPane.INFORMATION_MESSAGE);
    }
}
