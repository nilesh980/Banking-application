package baking;



import java.util.Scanner;

class Bank_accout{
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    Bank_accout(String cname, String cid)
    {
        this.customerName = cname;
        this.customerID = cid;
    }


    void deposite(int amout){
        if(amout!=0){
            balance = balance + amout;
            previousTransaction = amout;
        }

    }
    void withdraw(int amount){
        if(amount!=0){
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    void GetPreviousTransaction()
    {
        if(previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Withdraw: "+Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction occured ");
        }
    }

    void showmenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome: "+customerName);
        System.out.println("Your ID is: "+customerID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do
        {
            System.out.println("==========================================================");
            System.out.println("Enter an option");
            System.out.println("==========================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){

                case 'A':
                    System.out.println("-----------------------------------");
                    System.out.println("Balance: "+balance);
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to deposite: ");
                    System.out.println("-----------------------------------");
                    int amount = scanner.nextInt();
                    deposite(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------");
                    System.out.println("Enter amount to withdraw: ");
                    System.out.println("-----------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------");
                    GetPreviousTransaction();
                    System.out.println("-----------------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("***********************************");
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again");
                    break;
            }

        }while (option!='E');

        System.out.println("Thank You for using our service ");
    }
}
public class baking_app {
    public static void main(String[] args) {
        Bank_accout bm = new Bank_accout("Saurabh", "BA0001");
        bm.showmenu();
    }
}

