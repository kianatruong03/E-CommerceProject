/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package truongkianaproject1;

/**
 *
 * @author kiana
 */
public interface Interface {
    
    /**
     * given the product id and product quantity, it restocks the amount missing
     * @param ID
     * @param amount
     * @return 
     */
    public int restockInventory(int ID, int amount);

}
