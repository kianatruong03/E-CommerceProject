/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongkianaproject1;

import java.util.ArrayList;

/**
 *
 * @author kiana
 */
public abstract class Product {
    
    int bInventory;
    int cdInventory;
    int dvdInventory;
    int inventory;
//    private double bookPrice = 7.00;
//    private double cdPrice = 2.99;
//    private double dvdPrice = 3.99;
    
    ArrayList<BookOrder> listOfMembers = new ArrayList<BookOrder>();
    private String title;
    private int ID;
    private double priceNumber;

    public Product() {
        bInventory = 50;
        cdInventory = 50;
        dvdInventory= 50;
    }

    public Product(String title, int ID, double priceNumber ){
        this.title = title;
        this.ID = ID;
        this.priceNumber = priceNumber;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getID(){
        return ID;
    }
    
    public double getPriceNumber(){
        return priceNumber;
    }
    
    public int getInventory(){
        return inventory;
    }
    
    public int setInventory(int inventory){
        this.inventory = inventory;
        return inventory;
    }
    
    public int bookInventorySpace(int numberOfBooks){
        bInventory -= numberOfBooks;
        return bInventory;
    }
    public int cdInventorySpace(int numberOfCds){
        cdInventory -= numberOfCds;
        return cdInventory;
    }
    public int dvdInventorySpace(int numberOfDvds){
       dvdInventory -= numberOfDvds;
       return dvdInventory;
    }
 
    public void memberList(String name, boolean premiumMember, double totalCost, int books, int cds, int dvds){
        BookOrder newMember = new BookOrder(name, premiumMember, totalCost, books, dvds, cds);
        listOfMembers.add(newMember);
    }

}
