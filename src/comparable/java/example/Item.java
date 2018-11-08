/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable.java.example;

import java.math.BigDecimal;

/**
 *
 * @author Momir Sarac
 */
public class Item implements Comparable<Item> {

    private String nameOfTheItem;
    private BigDecimal priceOfTheItem;
    private int quantityOfTheItem;

    public Item() {
    }

    public Item(String nameOfTheItem, BigDecimal priceOfTheItem, int quantityOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
        this.priceOfTheItem = priceOfTheItem;
        this.quantityOfTheItem = quantityOfTheItem;
    }

    /**
     * @return the nameOfTheItem
     */
    public String getNameOfTheItem() {
        return nameOfTheItem;
    }

    /**
     * @param nameOfTheItem the nameOfTheItem to set
     */
    public void setNameOfTheItem(String nameOfTheItem) {
        this.nameOfTheItem = nameOfTheItem;
    }

    /**
     * @return the priceOfTheItem
     */
    public BigDecimal getPriceOfTheItem() {
        return priceOfTheItem;
    }

    /**
     * @param priceOfTheItem the priceOfTheItem to set
     */
    public void setPriceOfTheItem(BigDecimal priceOfTheItem) {
        this.priceOfTheItem = priceOfTheItem;
    }

    /**
     * @return the quantityOfTheItem
     */
    public int getQuantityOfTheItem() {
        return quantityOfTheItem;
    }

    /**
     * @param quantityOfTheItem the quantityOfTheItem to set
     */
    public void setQuantityOfTheItem(int quantityOfTheItem) {
        this.quantityOfTheItem = quantityOfTheItem;
    }

    /**
     * toString method returns formatted string with all the written variables
     * and it's values of the object of class Item.
     *
     * @return
     */
    @Override
    public String toString() {

        return String.format("{nameOfTheItem=%s, priceOfTheItem=%.2f, quantityOfTheItem=%d}", nameOfTheItem, priceOfTheItem, quantityOfTheItem);
    }

    /**
     * Natural comparison method compareTo() of the class Item.
     *
     * @param i
     * @return natural ordering of the objects Item by it's QuantityOfTheItem
     * value
     *
     */
    @Override
    public int compareTo(Item i) {
        int quantityItems = ((Item) i).getQuantityOfTheItem();
        return this.quantityOfTheItem - quantityItems;
    }

}
