package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("*_*_*_*_*_*_*_*_*_*_Welcome to Address Book_*_*_*_*_*_*_*_*_*_*");
        Contact contact = new Contact();
        int choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1: Add Contact.\s
                    2: Update Contact.\s
                    3: Delete Contact.\s
                    4: View Contact.\s
                    5: Exit.""" );
            System.out.println();
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.addUser();
                    System.out.println("\n Added Successfully... \n");
                    break;

                case 2:
                    contact.update();
                    break;

                case 3:
                    contact.deleteContact();
                    break;

                case 4:
                    contact.display();
                    break;

                case 5:
                    System.out.println(" Exit");
                    return;

                default:
                    System.out.println("You have Entered Wrong Choice ");
                    System.out.println();
            }
        }
    }
}
