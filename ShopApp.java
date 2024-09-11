/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = .2;
        double total = 0;
        int measurement = 3;

        List<Clothing> order = new ArrayList<>();

        Customer c1 = new Customer();
        c1.setName("Harrison");
        c1.setSize("S");
        setMeasurement(measurement, c1);
        System.out.println("Hello customer: " + c1.getName() + "We have your size being: " + c1.getSize());

        Clothing item1 = new Clothing("Blue Jacket", 20.9);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing item4 = new Clothing("Red T-Shirt", 10.5, "S");
        Clothing item5 = new Clothing("Green Scarf", 9.5, "S");

        order.add(item1);
        order.add(item2);
        order.add(item3);
        order.add(item4);
        order.add(item5);

        

        
        /* 
        Using array and showing different loop options
        enhanced 
        streams
        
         */
        
//        Clothing[] items = {item1, item2, item3};
//        for (int i = 0; i < items.length; i++){
//            System.out.println(items[i]);
//        }
//        
//        for (Clothing item : items){
//            System.out.println(item);
//        }
//        // Convert array to stream and use forEach
//        Arrays.stream(items).forEach(fruit -> System.out.println(fruit));
//        
//        // Alternatively, you can use method references
//        Arrays.stream(items).forEach(System.out::println);
//        
        int count = 1;
        for (Clothing item : order) {
            if(item.getSize().equals(c1.getSize())){
               System.out.println("item"+ count +": " + item);
               total += item.getPrice() * (1 + tax);
               count++;
            }
            if(total > 15){
                break;
            }
            
        }
//        total *= (1 + tax);
//        total += (total * tax); by adding the 1 to the tax will include the tax base line 
//Total Price after Tax=41.9×(1+0.2)=41.9×1.2=50.28
        System.out.printf("Your total after tax comes to: %.2f%n", total);
    }

    static void setMeasurement(int meas, Customer c) {
        switch (meas) {
            case 1, 2, 3:
                c.setSize("S");
                break;
            case 4, 5, 6:
                c.setSize("M");
                break;
            case 7, 8, 9:
                c.setSize("L");
                break;
            default:
                c.setSize("X");
                break;
        }
    }

}
