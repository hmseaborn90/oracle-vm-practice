/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public Customer() {
    }

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }
    

    public void addItems(Clothing[] itemsToAdd) {
        this.items = itemsToAdd;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0;
        int count = 1;
        for (Clothing item : items) {
            if (item.getSize().equals(getSize())) {
                System.out.println("item" + count + ": " + item);
                total += item.getPrice();
//                total += item.getPrice() * (1 + tax);
                count++;
            }
            if (total > 15) {
                break;
            }

        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

//    private void setMeasurement(int measurement) {
//        
//    }
}
