/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable.java.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Momir Sarac
 */
public class ComparableJavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Item> list = listOfItems();
        System.out.println("Before sorting ...");
        for (Item i : list) {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        }
        /* 
        // in Java 1.8
           list.forEach((i) -> {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        });
         */

        // sorting
        Collections.sort(list);

        System.out.println("After sorting ...");
        for (Item i : list) {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        }
        /*
       // In Java 1.8
          list.forEach((i) -> {
            System.out.print(i.getQuantityOfTheItem() + "\n");
        });
         */
    }

    private static List<Item> listOfItems() {

        // typesafe generic declaration
        List<Item> list = new ArrayList<Item>();

        list.add(new Item("USB stick", new BigDecimal(19.99), 35));
        list.add(new Item("Laptop", new BigDecimal(599.99), 2));
        list.add(new Item("Snacks", new BigDecimal(0.99), 289));
        list.add(new Item("TV screen", new BigDecimal(189.99), 5));
        return list;
    }

}
