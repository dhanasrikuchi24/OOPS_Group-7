/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NIKHILA CHOWDARY VAITLA
 */
public class EnergyDrinks extends AbstractBeverage{
    private String drinkName;
    private String originCountry;
    private String companyName;

    public EnergyDrinks(String drinkName, String originCountry, String companyName, String name) {
        super(name);
        this.drinkName = drinkName;
        this.originCountry = originCountry;
        this.companyName = companyName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Override
    public String toString() {
        return drinkName + " " + originCountry + " " + companyName;
    }
    
    @Override
    public String getDescription() {
        return "a jar of energy drink for instant energy.";
    }
  
    
}
