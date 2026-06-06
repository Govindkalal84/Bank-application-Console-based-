package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean running=true;

        System.out.println("Welcome to Console Bank");
        while (running) {

            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statement
                    6) List Accounts
                    7) Search Accounts by Customer Name
                    0) Exit
                    """);
            System.out.println("CHOOSE:");
            String choice = sc.nextLine().trim();
            System.out.println("CHOISE:" + choice);

            switch (choice)
            {
                case "0" -> running=false;
                case "1"->  openAccount(sc);
                case "2"->  deposit(sc);
                case "3"->  withdraw(sc);
                case "4"->  transfer(sc);
                case "5"->  accountStatement(sc);
                case "6"->  listAccounts(sc);
                case "7"->  searchAccounts(sc);



            }
        }

    }

    private static void openAccount(Scanner sc) {
        System.out.println("Customer name: ");
        String name = sc.nextLine().trim();
        System.out.println("Customer email: ");
        String email = sc.nextLine().trim();
        System.out.println("Account Type(Saving/Current): ");
        String type = sc.nextLine().trim();
        System.out.println("Initial Deposit: ");
        String amountStr = sc.nextLine().trim();
        Double  initial= Double.valueOf(amountStr);
    }

    private static void deposit(Scanner sc) {
    }

    private static void withdraw(Scanner sc) {
    }

    private static void transfer(Scanner sc) {
    }

    private static void accountStatement(Scanner sc) {
    }

    private static void listAccounts(Scanner sc) {
    }

    private static void searchAccounts(Scanner sc) {
    }
}

