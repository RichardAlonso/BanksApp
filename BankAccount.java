import java.util.Scanner;
class BankAccount
{
double balance;
double previousTransaction;
String customerName;
String customerId;

BankAccount (String cName, String cId)
{
  customerName = cName;
  customerId   = cId;
  
}

void deposit ( double amount)
{
  if (amount != 0 )
  balance = balance + amount;
  previousTransaction = amount;
 
}

void withdraw ( double amount)
{
  if (amount != 0)
  balance = balance - amount;
  previousTransaction = -amount;

}

void getPreviousTransaction ()
{
  if (previousTransaction > 0)
  {
    System.out.println("Deposited: " + previousTransaction);
  }
  else if (previousTransaction < 0 )
  {
    System.out.println("Withdraw: " + previousTransaction); 
  }
  else
  System.out.println("No transaction occured");
}
 
void menu () 
{
char option;
Scanner scanner = new Scanner(System.in);

System.out.println("Welcome: " + customerName);
System.out.println("Your Id is: " + customerId);
System.out.println("\n");
System.out.println("=======================================================");
System.out.println("---Enter a character");
System.out.println("A. Check balance");
System.out.println("B. Deposit");
System.out.println("C. Withdraw");
System.out.println("D. Previous Transaction");
System.out.println("E. Exit");
System.out.println("======================================================");
  do
  {
  System.out.println("Enter");
        option = scanner.next().charAt(0);
    option = Character.toUpperCase(option);
    switch (option)
    {
      case 'A':
      System.out.println("Balance = " + balance);
      System.out.println("-------------------------------------------------");
      break;
      
      case 'B':
      System.out.println("Please enter amount to deposit");
      double amount = scanner.nextDouble();
      deposit(amount);
      System.out.println("-------------------------------------------------");
      break;
      
      case 'C':
      System.out.println("Please enter amount to be withdraw");
      double amountWithdraw = scanner.nextDouble();
      withdraw(amountWithdraw);
      System.out.println("-------------------------------------------------");
      break;
      
      case 'D':
      getPreviousTransaction();
      System.out.println("--------------------------------------------------");
      break;
      
      case 'E':
      break;
      
      default:
      System.out.println("Invalid Option! Please try agrain");
      break;
      }
      }
        while (option != 'E');
        System.out.println("Thanks for using our service");
        System.out.println("Hope to see you soon");
        
      
      
    
   
    


}// end manu

}//end class