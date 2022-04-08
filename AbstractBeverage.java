/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NIKHILA CHOWDARY VAITLA
 */
public abstract class AbstractBeverage {

    /**
     * All have a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
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
