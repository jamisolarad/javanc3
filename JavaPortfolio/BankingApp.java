package JavaPortfolio;

import java.util.ArrayList;
import java.util.Scanner;


class User {
   int userId;
   int pinCode;
   String userName;
   double accountBalance;
   
   public User(int userId, int pinCode, String userName, double accountBalance) {
    this.userId = userId;
    this.pinCode = pinCode;
    this.userName = userName;
    this.accountBalance = accountBalance;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public int getPinCode() {
      return pinCode;
   }

   public void setPinCode(int pinCode) {
      this.pinCode = pinCode;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public double getAccountBalance() {
      return accountBalance;
   }

   public void setAccountBalance(double accountBalance) {
      this.accountBalance = accountBalance;
   }

}

public class BankingApp {
   private static ArrayList<User> users = new ArrayList<User>();
   private static User loggedInUser = null;

   public static void main(String[] args){
      userList();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to JCash");
      System.out.println("Please log in your account");
      
      while (true) {
          if (loggedInUser == null) {
            login(scanner);
          }
          else{
            menu(scanner);
          }  
      }
   }

   private static void userList() {
      users.add(new User(412435, 7452, "Chris Sandoval", 32000.00));
      users.add(new User(264863, 1349, "Marc Yim", 1000.00));
    }

   private static void login(Scanner scanner){
      System.out.print("Enter your userId: ");
      int userId = scanner.nextInt();

      System.out.print("Enter your 4 digit pin: ");
      int pinCode = scanner.nextInt();

      for (User user : users) {
         if(user.getUserId() == userId && user.getPinCode() == pinCode) {
            loggedInUser = user;
            System.out.println("Hi " + loggedInUser.getUserName() + " You are now logged in");
            return;
         }
      }
      System.out.println("Invalid Account details");
   }

   private static void menu(Scanner scanner) {
      System.out.println("\nWhat do you want to do?");
      System.out.println("1. Check Balance");
      System.out.println("2. Cash-in");
      System.out.println("3. Money Transfer");
      System.out.println("4. Logout");
      System.out.print("Your choice: ");

      while (!scanner.hasNextInt()) {
         System.out.println("Invalid input. Please enter a number between 1 and 4.");
         System.out.println("Your choice: \n");
         scanner.next();
      }
 
      int choice = scanner.nextInt();
         switch(choice) {
            case 1:
            checkBalance(scanner);
            break;

            case 2:
            depositCash(scanner);
            break;

            case 3:
            moneyTransfer(scanner);
            break;

            case 4:
            logout();
            break;

            default:
               System.out.println("Invalid option");
         }
   }  

   private static void checkBalance(Scanner scanner) {
      System.out.println("Your Account Balance is: "+ loggedInUser.getAccountBalance());
   }

   private static void depositCash(Scanner scanner) {
      System.out.println("Enter Amount to cash in: ");
      
      while (!scanner.hasNextDouble()) {
         System.out.println("Invalid input. Please enter a valid amount.");
         System.out.print("Enter the amount to cash-in: ");
         scanner.next();
     }
      
      double amount = scanner.nextDouble();
      if (amount > 0) {
         loggedInUser.setAccountBalance(loggedInUser.getAccountBalance() + amount);
         System.out.println("Successful deposit!");
         System.out.println("Your current balance is:" + loggedInUser.getAccountBalance());
      }
      else {
         System.out.println("Invalid Amount");
      } 
   }

   private static void moneyTransfer(Scanner scanner) {
      System.out.print("Enter User ID of the receiver: ");

      while (!scanner.hasNextInt()) {
          System.out.println("Invalid input. Please enter a valid User ID.");
          System.out.print("Enter User ID of the receiver: ");
          scanner.next();
      }

      int recipientId = scanner.nextInt();

      User recipient = null;
      for (User user : users) {
          if (user.getUserId() == recipientId) {
              recipient = user;
              break;
          }
      }

      if (recipient != null) {
          System.out.print("Enter amount to transfer: ");

          while (!scanner.hasNextDouble()) {
              System.out.println("Invalid input. Please enter a valid amount.");
              System.out.print("Enter amount to transfer: ");
              scanner.next();
          }

          double amount = scanner.nextDouble();

          if (amount > 0 && loggedInUser.getAccountBalance() >= amount) {
              loggedInUser.setAccountBalance(loggedInUser.getAccountBalance() - amount);
              recipient.setAccountBalance(recipient.getAccountBalance() + amount);
              System.out.println("Successfully transferred!");
          } else {
              System.out.println("Insufficient balance or invalid amount.");
          }
      } else {
          System.out.println("Recipient User ID not found.");
      }
  }

  private static void logout() {
   System.out.println("You have been logged out.");
   loggedInUser = null;
  }
}
