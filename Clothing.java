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
    
    private String description;
    private double price;
    private String size = "M";

    
    public Clothing(String description, double price) {
        this.description = description;
        this.price = price;
    }
    
    
    public Clothing(String desc, double price, String size){
        this.description = desc;
        this.price = price;
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
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
}
