/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

import javax.swing.JOptionPane;

/**
 *
 * @author bryanshintani
 */
public class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ask user to enter sku
        String input = JOptionPane.showInputDialog(null, "Please enter product SKU");
        
        // retrieve product from DB
        Product aProduct = ProductDB.getProduct(input);
        
        // check if the product is null
        if(aProduct == null) {
            JOptionPane.showMessageDialog(null, "Invalid SKU: " + input + ". No matching product found.");
        } else {
            JOptionPane.showMessageDialog(null, aProduct.toString());
        }
    }
}
