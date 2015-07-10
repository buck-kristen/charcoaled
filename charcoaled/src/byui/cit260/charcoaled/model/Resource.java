/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.model;

/**
 *
 * @author justdance2007
 */
public class Resource {
    private Resources item; 
    private int quantity; 
    
    public Resource (Resources item, int quantity) {
        this.item = item;
        this.quantity = quantity; 
    }

    public Resources getItem() {
        return item;
    }

    public void setItem(Resources item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void useItem() {
        quantity = quantity - 1; 
    }
    public String toString() {
        return item.toString() + "\t\t" + quantity;
    }
}
