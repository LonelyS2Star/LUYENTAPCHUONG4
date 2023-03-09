/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHHOC;

/**
 *
 * @author Ngoc Nhi
 */
public class Square extends Rectangle {

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }
    double side;
    public Square(double side, String color, boolean fille){
        this.side=side;
        this.color=color;
        this.filled=filled;
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "kich thuoc la"+side;
    }
    
}
