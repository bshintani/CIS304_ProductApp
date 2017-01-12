/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 *
 * @author bryanshintani
 */
public class Product {
    String sku;
    String description;
    double price;
    
    public Product(String aSku, String aDescription, double aPrice) {
        this.sku = aSku;
        this.description = aDescription;
        this.price = aPrice;
    }
    
    public void setSku(String aSku) {
        sku = aSku;
    }
    
    public String getSku() {
        return sku;
    }
    
    public void setDescription(String aDescription) {
        description = aDescription;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setPrice(double aPrice) {
        price = aPrice;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        String summary = "Product Summary\n\n";
        
        summary += "Sku: " + this.sku + "\n";
        summary += "Description: " + this.description + "\n";
        summary += "Price: " + this.price;
        
        return summary;
    }
}
