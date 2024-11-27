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
            System.out.println(" *************************** \n " +
                    "    ops 1 = Find out the bank account balance\n" +
                    "     ops 2 = Withdraw money\n" +
                    "     ops 3 = To deposit money\n" +
                    "     ops 4 = Press -1 for exit\n " +
                    " *************************** ");
            System.out.print("Please choose your ops: ");
            int opt = scanner.nextInt();
            if (opt == -1){
                System.out.println("Exit!!");
                break;
            }
            switch (opt){
                case 1:
                    System.out.println("Bank account balance: " + account_balance);
                    break;
                case 2:
                    System.out.print("How much do you withdraw: ");
                    int withdraw = scanner.nextInt();
                    if (account_balance < withdraw){
                        System.out.println("You can't withdraw money because you don't have enough balance at your account.");
                        break;
                    }
                    else if (account_balance >= withdraw){
                        account_balance -= withdraw;
                        System.out.println("New bank balance is : " + account_balance);
                    }
                    break;
                case 3:
                    System.out.print("How much do you deposit: ");
                    int deposit = scanner.nextInt();
                    account_balance += deposit;
                    System.out.println("New bank balance is : " + account_balance);
                    break;
                default:
                    System.out.println("Wrong opt");
                    break;
            }
        }
    }
}
