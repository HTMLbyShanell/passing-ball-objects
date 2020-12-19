/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spannpassingobjects;

/**
 *
 * @author shanell spann
 */
public class Ball {
    
    private double diameter;
    private double radius;
    private double circumference;
    private String color;
    private String type; 
    
    public Ball(double d, double r, double circum, String color, String t)
    {
        this.diameter = d;
        this.radius = r;
        this.circumference = circum;
        this.color = color;
        this.type = t;      //this.(original variable name) = new constructor method variable object name
    } 

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() //form of polymorphism = two methods that exist but creating one that behaves the way we want it to. 
    {
        return "\nI'm having a ball! Pun intended!" +
               "\n\t" + getDiameter() + " inches" +
               "\n\t" + getRadius() + " centimeters" +
               "\n\t" + getCircumference() + " inches" +
                "\n\t" + getColor() +
               "\n\t" + getType();
    }   
}
