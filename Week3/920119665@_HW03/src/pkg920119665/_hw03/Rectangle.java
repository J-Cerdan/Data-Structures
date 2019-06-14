/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg920119665._hw03;

/**
 *
 * @author josep
 */
public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        width=length=0.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    
    @Override
    public double getArea() {
        return width * length;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    
    @Override
    public String toString() {
        return "Shape: Rectangle Width: " + width + " Length: " + length
                + " Colour: " + colour + " Filled: " + filled;    
    }
    
}
