import javax.swing.*;

public class Q3 {
    public static void main(String[] args)
    {
        String name, taxIncomeAsString;
        double taxIncome, taxRate, taxAmount=0, incomeAfterTax=0;

        name = JOptionPane.showInputDialog("Enter your name: ");

        taxIncomeAsString = JOptionPane.showInputDialog("Enter your taxable income: ");
        taxIncome = Integer.parseInt(taxIncomeAsString);

        if(taxIncome>=0 && taxIncome<=20000)
        {
            taxRate=0;
        }
        else if(taxIncome>20000 && taxIncome<=36000)
        {
            taxRate=0.2;
            taxAmount=taxIncome*taxRate;
            incomeAfterTax=taxIncome-taxAmount;
        }
        else
        {
            taxRate=0.41;
            taxAmount=taxIncome*taxRate;
            incomeAfterTax=taxIncome-taxAmount;
        }

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nGross Income: EUR" + taxIncome +
                                      "\nTax Amount: EUR" + (float)taxAmount + "\nIncome After Tax: EUR" + incomeAfterTax,"Tax",
                                       JOptionPane.INFORMATION_MESSAGE);
    }
}
