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
public abstract class Shape {
    protected String colour;
    protected boolean filled;
    
    public static void main(String[] args){
        
        //Upcast Circle to Shape
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);                   //Version: Circle's toString
        System.out.println(s1.getArea());         //Version: Circle's getArea
        System.out.println(s1.getPerimeter());    //Version: Circle's getPerimeter
        System.out.println(s1.getColour());       //Version: Shape's getColour
        System.out.println(s1.isFilled());        //Version: Shape's isFilled
        //System.out.println(s1.getRadius());
        /*
        Error: as s1 is upcasted and is of type Shape it cannot
        access the subclass methods unless it is defined from an
        abstract method. Since getArea and getPerimeter are both
        abstract methods, the defined methods within Circle can
        be accessed. However, since getRadius is unique and only
        defined in Circle without having an abstract method in shape
        it cannot be accessed.
        */
        
        //Downcast to Circle
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        
        //Error: Abstract cannot be instantiated
        //Shape s2 = new Shape(); 
        
        //Upcast
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        //System.out.println(s3.getLength());
        // Error: Same as s1 example
        
        //Downcast
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());
        
        //Upcast
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        //System.out.println(s4.getSide());  
        // Error: Same as s1 example

        
        //Downcast s4 to Rectangle
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.getColour());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        /*
        From my understanding, an abstract class is one that contains
        one or more abstract methods. Astract methods are methods that
        contain no implementation. The reason we use abstract methods
        is to ensure that the sub-classes implement these methods if
        we know that they will all have the same method but with different
        implementations. For example, within this project we want to 
        be able to calculate the area and perimeter of our shapes
        so therefore we make it abastract and since they have different
        implementations they will all contain different formulas in
        their own methods.
        */
        
        
    }

    public Shape() {
        colour="";
        filled=false;
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return " Colour: " + colour + " Filled: " + filled;
    }
    
    
}


