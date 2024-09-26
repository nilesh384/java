import java.util.Scanner;

class ATM{
    Scanner sc = new Scanner(System.in);

    float balance;
    int PIN = 3453;

    ATM(){
        System.out.println("Enter PIN");
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN){
            System.out.println("Welcome");
            menu();
        }else{
            System.out.println("Enter correct PIN");
        }
        ATM obAtm = new ATM();
    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        int choice = sc.nextInt();

        switch(choice){
            case 1: checkBalance();
            break;
            case 2: withdraw();
            break;
            case 3: deposit();
            break;
            case 4: return;
            default: System.out.println("Invalid choice");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("Current Balance: "+balance);
        menu();
    }

    public void withdraw(){
        System.out.println("Enter amount to withdraw");
        float amount = sc.nextFloat();
        if(amount<=balance){
            balance -= amount;
            System.out.println("Money withdrawn successfully");
            System.out.println("Current Balance: "+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
        menu();
    }

    public void deposit(){
        System.out.println("Enter amount to deposit");
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money deposited successfully");
        System.out.println("Current Balance: "+balance);
        menu();
    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM obAtm = new ATM();
    }
}
