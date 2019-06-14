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
public class Square extends Rectangle{

    public Square() {
        this(0.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(side, side, colour, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }
    
     @Override //output required used by system.out.println(obj/square obj/arrays.tostring(arr)); 
    public String toString() {
        return "Shape: Square Side: " + width
                + " Colour: " + colour + " Filled: " + filled;    
    }    
    
}
