import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        String choice;
        float numb1, numb2;
        float total=0;

        Scanner input = new Scanner(System.in);

        System.out.print("A (for addition)" +
                          "\nS (for subtraction)" +
                           "\nM (for multiplication)" +
                            "\nD (for division)" +
                              "\n\nSelect one of these choices:");
        choice = input.nextLine();

        switch(choice)
        {
            case "A":
                System.out.print("\nEnter a number: ");
                numb1 = input.nextFloat();

                System.out.print("Enter another number: ");
                numb2 = input.nextFloat();

                total=numb1+numb2;

                System.out.println("\nThe total of " + numb1 + " + " + numb2 + " is " + total);
                break;
            case "S":
                System.out.print("\nEnter a number: ");
                numb1 = input.nextFloat();

                System.out.print("Enter another number: ");
                numb2 = input.nextFloat();

                total=numb1-numb2;

                System.out.println("\nThe total of " + numb1 + " - " + numb2 + " is " + total);
                break;
            case "M":
                System.out.print("\nEnter a number: ");
                numb1 = input.nextFloat();

                System.out.print("Enter another number: ");
                numb2 = input.nextFloat();

                total=numb1*numb2;

                System.out.println("\nThe total of " + numb1 + " * " + numb2 + " is " + total);
                break;
            case "D":
                System.out.print("\nEnter a number: ");
                numb1 = input.nextFloat();

                System.out.print("Enter another number: ");
                numb2 = input.nextFloat();

                total=numb1/numb2;

                System.out.println("\nThe total of " + numb1 + " / " + numb2 + " is " + total);
                break;
            default:
                System.out.println("\nInvalid choice!! Must be between A, S, M or D");
                break;
        }
    }
}