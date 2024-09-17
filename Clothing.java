/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class Clothing {
    
    public static final double MIN_PRICE = 10;
    public static final double TAX_RATE = 0.08999;
    private String description;
    private double price;
    private String size = "M";

    
    public Clothing(String description, double price) {
        this.description = description;
        setPrice(price);
    }
    
    
    public Clothing(String desc, double price, String size){
        this.description = desc;
        setPrice(price);
        this.size = size;
    }
    
    @Override
    public String toString(){
        return description + ", " + price + ", " + size;
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() { 
        return price + price * TAX_RATE;
    }

    public void setPrice(double price) {
        this.price = (price < MIN_PRICE) ? MIN_PRICE : price;
        
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
}
