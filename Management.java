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
public class Management implements Interface{
    
    ArrayList<Product> product = new ArrayList(); 
    
    public Management(){
        Book book1 = new Book("The Lion, The Witch and the Wardrobe", 264420, 7.99);
        Book book2 = new Book("The Magic Fish", 548379, 6.99);
        Book book3 = new Book("The Witch Boy", 423789, 8.99);
        CD CD1 = new CD("Planet Her", 907823, 2.99);
        CD CD2 = new CD("DemiDevil", 683249, 2.50);
        CD CD3 = new CD("Ado", 869230, 1.99);
        DVD DVD1 = new DVD("Turning Red", 635435, 3.99);
        DVD DVD2 = new DVD("Tangled", 827391, 3.69);
        DVD DVD3 = new DVD("Encanto", 671423, 4.00);

        product.add(book1);
        product.add(book2);
        product.add(book3);
        product.add(CD1);
        product.add(CD2);
        product.add(CD3);
        product.add(DVD1);
        product.add(DVD2);
        product.add(DVD3);

    }
    
    public ArrayList<Product> getProduct(){
        return product;
    }
   
    public int restockProduct(int ID, int amount){
        for(Product p: product){
            if(ID == p.getID()){
                p.setInventory(p.getInventory()+ amount);
            }   
        }
        return -1;
    }

    @Override
    public int restockInventory(int ID, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}




