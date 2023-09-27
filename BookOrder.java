/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongkianaproject1;

/**
 *
 * @author kiana
 */
public class BookOrder {
    
    String name = "";
    boolean premiumMember = false;
    private double totalCost = 0;
    private int numberOfBooks = 0;
    private int numberOfDvds = 0;
    private int numberOfCds = 0;

    public BookOrder(String nameMember, boolean isPremium, double theTotalCost, int books, int dvds, int cds ) {
        this.name = nameMember;
        this.premiumMember = isPremium;
        this.totalCost = theTotalCost;
        this.numberOfCds = cds;
        this.numberOfDvds = dvds;
        this.numberOfBooks = books;
    }
    

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getNumberOfDvds() {
        return numberOfDvds;
    }

    public int getNumberOfCds() {
        return numberOfCds;
    }
    
    public void memberRegister(){
        premiumMember = true;
    }

    public double totalSpent(double total) {
        totalCost -= total;
        return totalCost;
    }
    
    
    
    
}
