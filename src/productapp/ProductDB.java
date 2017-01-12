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
public class ProductDB {
    
    private static Product aProduct = null;
    
    public static Product getProduct(String aSku) {
        
        if(aSku.equalsIgnoreCase("100")) {
            aProduct = new Product("100", "Milk", 2.99);
        } else if(aSku.equalsIgnoreCase("200")) {
            aProduct = new Product("200", "Coffee", 3.25);
        } else if(aSku.equalsIgnoreCase("300")) {
            aProduct = new Product("300", "Tea", 1.99);
        } else if(aSku.equalsIgnoreCase("400")) {
            aProduct = new Product("400", "Coffee", 4.00);
        } else {
            aProduct = null;
        }
        
        return aProduct;
    }
    
}
