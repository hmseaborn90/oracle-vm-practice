/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.NumberFormat;

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
        double total;
        int measurement = 3;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        List<Clothing> order = new ArrayList<>();

        Customer c1 = new Customer("Harrison", measurement);

//        c1.setSize("S");
//        c1.setSize(measurement);
        System.out.println("Hello customer: " + c1.getName() + " We have your size being: " + c1.getSize());

        System.out.println("Minumum price: " + Clothing.MIN_PRICE + " Tax rate: " + Clothing.TAX_RATE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing item4 = new Clothing("Red T-Shirt", 10.5, "M");
        Clothing item5 = new Clothing("Green Scarf", 9.5, "L");

        order.add(item1);
        order.add(item2);
        order.add(item3);
        order.add(item4);
        order.add(item5);
        System.out.println(currency.format(item5.getPrice()));
        Clothing[] itemsArray = order.toArray(new Clothing[0]);
        c1.addItems(itemsArray);
//        Clothing[] returnedItems = c1.getItems();
//        for(Clothing item : returnedItems){
//            System.out.println(item.getPrice());
//        }
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
//        int count = 1;
//        for (Clothing item : order) {
//            if (item.getSize().equals(c1.getSize())) {
//                System.out.println("item" + count + ": " + item);
//                total += item.getPrice();
////                total += item.getPrice() * (1 + tax);
//                count++;
//            }
//            if (total > 15) {
//                break;
//            }
//
//        }
//        total *= (1 + tax);
//        total += (total * tax); by adding the 1 to the tax will include the tax base line 
//Total Price after Tax=41.9×(1+0.2)=41.9×1.2=50.28

        total = c1.getTotalClothingCost();

        System.out.println("Your total after tax comes to: "+ currency.format(total));
    }

}
