import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*In this program we'll code 2 steps first one is log in page
        after that if this person successfully enter than we'll enter the banking page*/

        Scanner scanner = new Scanner(System.in);

        String userNameData = "admin";
        String passwordData = "123456";

        System.out.print("Enter your username:");
        String userName = scanner.nextLine();
        System.out.print("Enter your password:");
        String password = scanner.nextLine();

        int balance = 1000;

        int loginWrongEnterController = 2;
        int loopWrongEnterController = 2;

        while(true){

            if(userName.equals(userNameData) && password.equals(passwordData)) {
                System.out.println("Transactions\n" +
                        "1 - Balance learning\n" +
                        "2 - Withdrawal\n" +
                        "3 - Deposit\n" +
                        "4 - Exit");
                System.out.print("Please enter what you want to do: ");
                int operation = scanner.nextInt();


                if(operation > 4 && loopWrongEnterController != 0){
                    System.out.print("You enter wrong operation. \nPlease try again.");
                    loopWrongEnterController--;
                    continue;
                }
                else if(loopWrongEnterController == 0){
                    System.out.println("You enter too many wrong operations. \nPlease try again later");
                    break;
                }
                else if(operation == 4){
                    System.out.println("Thank you for choosing us");
                    break;
                }
                else{
                    switch (operation){
                        case 1:
                            System.out.println("Your account balance is " + balance );
                            break;
                        case 2:
                            System.out.print("How much money do you want to withdraw: ");
                            int withdrawal = scanner.nextInt();
                            balance -= withdrawal;
                            System.out.println("Your account balance is " + balance );
                            break;
                        case 3:
                            System.out.print("How much money do you want to deposit: ");
                            int deposit = scanner.nextInt();
                            balance += deposit;
                            System.out.println("Your account balance is " + balance );
                            break;
                    }
                }
            }
            else if (!(userName.equals(userNameData)) && loginWrongEnterController != 0){
                System.out.println("Wrong username or password!");
                loginWrongEnterController--;
            }
            else if (!(password.equals(passwordData)) && loginWrongEnterController != 0){
                System.out.println("Wrong username or password!");
                loopWrongEnterController--;
            }
            else if(loginWrongEnterController == 0){
                System.out.println("You have entered wrong credentials");
                break;
            }
        }
    }
}
