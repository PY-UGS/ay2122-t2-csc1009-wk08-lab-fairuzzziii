package OOPG.Week8;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[]args){
        CheckingAccount ac1 = new CheckingAccount();
        Scanner input = new Scanner(System.in);
        try(input) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = input.nextDouble();
            ac1.deposit(depositAmount);

            System.out.printf("The balance after deposit is $%.2f\n",ac1.getBalance());
            
            System.out.print("Enter Withdraw amount: ");
            double withdrawAmount = input.nextDouble();
            ac1.withdraw(withdrawAmount);

            System.out.printf("The balance after withdraw is $%.2f\n",ac1.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.printf("ERROR: Sorry but your account is short by: $%.2f\n ",(e.getAmount()-ac1.getBalance()));
        } catch (IllegalArgumentException e) {
            System.out.printf("ERROR: The amount to be deposit has to be a value greater than 0.");
        }

    }
}