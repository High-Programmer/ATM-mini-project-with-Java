import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        We coding a ATM program with use to while loop.

        ops 1 = Find out the bank account balance
        ops 2 = Withdraw money
        ops 3 = To deposit money
        ops 4 = Press -1 for exit
         */



        int account_balance = 1000;


        while (true){
            System.out.print("Please enter one option: ");

            int ops = scanner.nextInt();
            if (ops == -1){
                System.out.println("Please don't forget taken your 1debit card...");
                break;
            }

            switch (ops){
                case 1:
                    System.out.println("Bank account balance: " + account_balance);
                    break;
                case 2:
                    System.out.print("How much do you withdraw: ");
                    int money_first = scanner.nextInt();
                    account_balance -= money_first;
                    if (account_balance <= 0){
                        System.out.println("You cant withdraw money because you dont have enough money.");
                    }
                    else if (account_balance > 0){
                        System.out.println("New bank balance: " + account_balance);
                    }
                    break;
                case 3:
                    System.out.print("How much money do you deposit: ");
                    int money_second = scanner.nextInt();
                    account_balance += money_second;
                    System.out.println("You're new bank account balance: " + account_balance);
                    break;
                default:
                    System.out.println("You cant do this operation");
                    break;
            }

        }
    }
}
