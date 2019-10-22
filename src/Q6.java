import javax.swing.*;

public class Q6 {
    public static void main(String[] args) {
        String choice, numb1AsString, numb2AsString;
        float numb1, numb2;
        float total=0;

        choice = JOptionPane.showInputDialog("A (for addition)" +
                                              "\nS (for subtraction)" +
                                               "\nM (for multiplication)" +
                                                "\nD (for division)" +
                                                 "\n\nSelect one of these choices:");

        do
        {
            switch(choice)
            {
                case "A":
                    numb1AsString = JOptionPane.showInputDialog("\nEnter a number: ");
                    numb1 = Integer.parseInt(numb1AsString);

                    numb2AsString = JOptionPane.showInputDialog("Enter another number: ");
                    numb2 = Integer.parseInt(numb2AsString);

                    total=numb1+numb2;

                    JOptionPane.showMessageDialog(null, "\nThe total of " + numb1 + " add by " +
                            numb2 + " is " + total,"Calculation!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "S":
                    numb1AsString = JOptionPane.showInputDialog("\nEnter a number: ");
                    numb1 = Integer.parseInt(numb1AsString);

                    numb2AsString = JOptionPane.showInputDialog("Enter another number: ");
                    numb2 = Integer.parseInt(numb2AsString);

                    total=numb1-numb2;

                    JOptionPane.showMessageDialog(null, "\nThe total of " + numb1 + " subtract by " +
                            numb2 + " is " + total,"Calculation!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "M":
                    numb1AsString = JOptionPane.showInputDialog("\nEnter a number: ");
                    numb1 = Integer.parseInt(numb1AsString);

                    numb2AsString = JOptionPane.showInputDialog("Enter another number: ");
                    numb2 = Integer.parseInt(numb2AsString);

                    total=numb1*numb2;

                    JOptionPane.showMessageDialog(null, "\nThe total of " + numb1 + " multiple by " +
                            numb2 + " is " + total,"Calculation!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "D":
                    numb1AsString = JOptionPane.showInputDialog("\nEnter a number: ");
                    numb1 = Integer.parseInt(numb1AsString);

                    numb2AsString = JOptionPane.showInputDialog("Enter another number: ");
                    numb2 = Integer.parseInt(numb2AsString);

                    total=numb1/numb2;

                    JOptionPane.showMessageDialog(null, "\nThe total of " + numb1 + " divide by " +
                            numb2 + " is " + total,"Calculation!",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"\nInvalid choice!! Must be between A, S, M or D",
                            "ERROR!",JOptionPane.ERROR_MESSAGE);
                    break;
            }

            choice = JOptionPane.showInputDialog("A (for addition)" +
                    "\nS (for subtraction)" +
                    "\nM (for multiplication)" +
                    "\nD (for division)" +
                    "\n\nSelect one of these choices (Q to quit):");
        }
        while(!choice.equals("Q"));

        if(choice.equals("Q"))
        {
            JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?",
                    "Confirmation Message!",JOptionPane.DEFAULT_OPTION);
        }
    }
}
