/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package truongkianaproject1;

import java.util.Scanner;
import java.util.*;
import static java.util.Collections.list;

/**
 *
 * @author kiana
 */
public class Store {
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //FastFoodKitchen kitchen = new FastFoodKitchen();
        Product productOrder = new Product() {};
        Management manage = new Management();
        ArrayList<Product> product = manage.getProduct();
        Scanner console = new Scanner(System.in);
        ArrayList<Product> shoppingCart = new ArrayList<Product>();
        
        
        System.out.println("Please enter 3 numbers to start the Store");
        int books = console.nextInt();
        int cds = console.nextInt();
        int dvds = console.nextInt();

        while(true) {
            // see what the user wants to do
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order products");
            System.out.println("\t 2. Become a Premium Member");
            System.out.println("\t 3. Donate money to the book store.");
            System.out.println("\t 4. Check Inventory.");
            System.out.println("\t 5. Restock Inventory.");
            System.out.println("\t 6. Membership payment.");
            System.out.println("\t 7. Exit");

            int num = console.nextInt();
            
            switch (num) {

                case 1:
                    int bookID;
                    System.out.println("What is your name?");
                    String name = console.next();
                    System.out.println("This is the Books we have in the store today");
                    
                    for(Product p: product){
                        if(p instanceof Book){
                            System.out.println(p.getTitle() +  " Price: " + p.getPriceNumber() + " Product ID:" + p.getID());
                        }
                    }
                    System.out.println("Which book would you like to buy?");
                    int id = console.nextInt();
                    for(Product p: product){
                        if(id ==  p.getID()){
                            shoppingCart.add(p);
                        }
                    }
                    System.out.println("Thank you for selecting a book.");
                    System.out.println("");
                    
                    System.out.println("This is the CDs we have in the store");
                    for(Product p: product){
                        if(p instanceof CD){
                            System.out.println(p.getTitle() +  " Price: " + p.getPriceNumber() + " Product ID:" + p.getID());
                        } 
                    }
                    System.out.println("Which CD would you like to buy?");
                    
                    int cdId = console.nextInt();
                    for(Product p: product){
                        if(cdId ==  p.getID()){
                            shoppingCart.add(p);
                        }
                    }
                    System.out.println("Thank you for selecting a CD.");
                    System.out.println("");
                    
                    System.out.println("This is the DVDs we have in the store");
                    for(Product p: product){
                        if(p instanceof DVD){
                            System.out.println(p.getTitle() + " Price: " + p.getPriceNumber() + " Product ID:" + p.getID());
                        }
                    }
                    System.out.println("Which DVD would you like to buy?");
                    int DVDid = console.nextInt();
                    for(Product p: product){
                        if(DVDid ==  p.getID()){
                            shoppingCart.add(p);
                        }
                    }
                    System.out.println("Thank you for selecting a DVD.");
                    System.out.println("");
                    
                    System.out.println("Are you a premium member? (Y/N)");
                    char membership = console.next().charAt(0);
                    if (membership == 'Y' || membership == 'y') {
                        boolean premium = true;
                    }
                    else{
                        boolean premium = false;
                    }
                    double totalSpent = 0.0;
                    for(Product p: shoppingCart){
                        totalSpent += p.getPriceNumber();
                    }
                    System.out.println("Your total is: $" + totalSpent);
                    
                    break;
                case 2:
                    System.out.println("Do you want to be Premium Member, it will cost $20/mothly (Y/N)");
                    String member = console.next();
                    if(member != "Y") {
                        System.out.println("You have become a premium member. The monthly fee is $20");
                        break;
                    } else {
                        System.out.println("You are a regular member, which is free.");
                    }
                    break;
                case 3:
                    System.out.println("Would you like to Donate $1 to the Book Store (Y/N)");
                    String donate = console.next();
                    if(donate != "Y"){
                        System.out.println("Thank you for your donation");
                        break;
                    }
                    else{
                        System.out.println("I see that you are broke. Have a good day.");
                    }
                    break;
                case 4:
                    System.out.println("This is what we have left in our inventory");
                    System.out.println("Books: " + (productOrder.bInventory - books));
                    System.out.println("DVD's: " + (productOrder.dvdInventory - dvds));
                    System.out.println("CD's: " + (productOrder.cdInventory - cds));
                    
                    break;
                case 5:
                    System.out.println("Restock Inventory");
                    for(Product restock: product){
                        System.out.println(restock.getTitle() + " Product ID:" + restock.getID()); 
                    }
                    System.out.println("Enter the product ID that you want to restock");
                    id = console.nextInt();
                    System.out.println("Thank you for restocking");
                    break;
                case 6:
                    System.out.println("Do you need a payment to renew your Premium membership? (Y/N)");
                    String paymentDecision = console.next();
                    if(paymentDecision != "Y") {
                        System.out.println("You need to pay $20");
                        break;
                    } else {
                        System.out.println("You don't need to renew your monthly payment at this time. We will email your 2-week notice.");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3, 4, 5 or 6");

            }
            

        } // end while loop
        
        
    }
    
}
