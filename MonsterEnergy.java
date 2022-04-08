/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Energy;

/**
 *
 * @author S545554
 */
public class MonsterEnergy extends EnergyDrinks {
    private double Sucrose;
    private double Taurine;
    private double price;
    private int quantity;

    public MonsterEnergy(String drinkName, String originCountry, String companyName, String name) {
        super(drinkName, originCountry, companyName, name);
        this.Sucrose = Sucrose;
        this.Taurine = Taurine;
        this.price = price;
        this.quantity = quantity;
    }
    public double getSucrose() {
        return Sucrose;
    }

    public double getTaurine() {
        return Taurine;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSucrose(double Sucrose) {
        this.Sucrose = Sucrose;
    }

    public void setTaurine(double Taurine) {
        this.Taurine = Taurine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MonsterEnergy{" + "Sucrose=" + Sucrose + ", Taurine=" + Taurine + ", price=" + price + ", quantity=" + quantity + '}';
    }
    public double calcAmount(){
        return price*quantity;
    }
    
    
    
}
