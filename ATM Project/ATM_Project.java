import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                /*
        We code an ATM program with use to while loop.

        ops 1 = Find out the bank account balance
        ops 2 = Withdraw money
        ops 3 = To deposit money
        ops 4 = Press 4 for exit
         */

        System.out.println("Transactions\n" +
                "1 - Balance learning\n" +
                "2 - Withdrawal\n" +
                "3 - Deposit\n" +
                "4 - Exit");

        int loopWrongEnterController = 2;

        while (true){
            System.out.print("Please enter what you want to do: ");
            int userInput = scanner.nextInt();
            float accountBalance = 1000;
            float tempBalance;

            if (userInput > 4 && userInput < 9 && loopWrongEnterController > 0){
                System.out.println("Wrong input, Please try again..");
                loopWrongEnterController--;
                continue;
            }
            else if (userInput == 4){
                System.out.println("Exiting...");
                break;
            }
            else if (loopWrongEnterController == 0){
                System.out.println("You enter too many wrong input \nExiting...");
                break;
            }

            switch (userInput){
                case 1:
                    System.out.println("Your account Balance is " + accountBalance + "$");
                    break;
                case 2:
                    System.out.print("How much money do you want to withdraw: ");
                    tempBalance = scanner.nextFloat();
                    if (tempBalance < accountBalance){
                        accountBalance -= tempBalance;
                        System.out.println("Your new account balance is " + accountBalance + "$");
                    }
                    else{
                        System.out.println("You don't have enough money to withdraw");
                    }
                    break;
                case 3:
                    System.out.print("How much money do you want to deposit: ");
                    tempBalance = scanner.nextFloat();
                    accountBalance += tempBalance;
                    System.out.println("Your new account balance is " + accountBalance + "$");
            }

        }
    }
}
