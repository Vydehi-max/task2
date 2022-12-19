import java.util.Scanner;
class Main
{
    public static void main(String args[] )
    {
        int bal = 50000;
        int withdraw=0,deposit,ch,transfer_amount=0,w=0,t=0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Transactions history");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.println("Choose the operation you want to perform:");
            ch=sc.nextInt();
            switch(ch)
             {            
                case 1:
                    {
                        System.out.println(" ATM TRANSACTION RECORD ");
                        if(w==1){
                        System.out.println("Transaction: Cash Withdrawal");
                        System.out.println("Amount withdrawn: "+withdraw);
                        }
                        if(t==1){
                        System.out.println("Transaction: Cash Transfer");
                        System.out.println("Amount transferred: "+transfer_amount);
                        }
                        System.out.println("Current Bal.: "+bal);
                        System.out.println("Available Bal.: "+bal);
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if(bal >= withdraw)
                        {
                            bal = bal - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("After withdraw, your account balance: "+bal);
                            w=1;
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;
                    }
                 
                case 3:
                    {
                        System.out.println("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        bal = bal + deposit;
                        System.out.println("Amount rupees "+deposit+" has been successfully deposited");
                        System.out.println("After deposit, your account balance: "+bal);
                        System.out.println("");
                        break;
                    }
                case 4:
                    {
                        System.out.print("Enter the recipient: \n");
                        System.out.println("Enter the amount to be transferred: \n");
                        transfer_amount=sc.nextInt();
                        if(transfer_amount > 0 && bal > transfer_amount)
                        {
                            System.out.println("Enter the Account number of the recipient:\n");
                            bal = bal-transfer_amount;
                            System.out.println("Amount rupees "+ transfer_amount +" transferred successfully");
                            System.out.println("After transaction, your account balance: "+bal);
                            t=1;
                        }
                        else
                        System.out.println("your current balance is low\n");
                        break;
                    }
                case 5:
                System.exit(0);
             }
        }
    }
}