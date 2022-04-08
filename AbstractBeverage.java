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
public  abstract class AbstractBeverage {
     protected String name = "no name";



    /**
     * Constructor
     *
     * @param name - the name of this instance 
     */
    public AbstractBeverage(String name) {
        this.name = name;
    }

    /**
     * abstract getDescription - has no implementation
     */
    public abstract String getDescription();


    /**
     * Get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }



}



    