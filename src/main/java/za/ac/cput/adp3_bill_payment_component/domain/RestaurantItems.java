package za.ac.cput.adp3_bill_payment_component.domain;

import java.util.HashMap;
import java.util.Map;

public class RestaurantItems
{
    private String itemName;
    private double itemPrice;

    public RestaurantItems(String itemName, double itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName()
    {
        return itemName;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }
}
