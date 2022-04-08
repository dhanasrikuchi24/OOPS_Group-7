/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NIKHILA CHOWDARY VAITLA
 */
public class RedBull extends EnergyDrinks {
   private double caffine_percentage;
   private double sweetner_percentage;
   private double price;
   private int quantity;

    public RedBull(double caffine_percentage, double sweetner_percentage, 
            double price, int quantity, String drinkName, String originCountry,
            String companyName, String name) {
        super(drinkName, originCountry, companyName, name);
        this.caffine_percentage = caffine_percentage;
        this.sweetner_percentage = sweetner_percentage;
        this.price = price;
        this.quantity = quantity;
    }

    public double getCaffine_percentage() {
        return caffine_percentage;
    }

    public void setCaffine_percentage(double caffine_percentage) {
        this.caffine_percentage = caffine_percentage;
    }

    public double getSweetner_percentage() {
        return sweetner_percentage;
    }

    public void setSweetner_percentage(double sweetner_percentage) {
        this.sweetner_percentage = sweetner_percentage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return caffine_percentage + " " + sweetner_percentage + " " + price + " " + quantity;
    }
    
    public double calcAmount(){
        return price*quantity;
    }
    
    
    
   
}
