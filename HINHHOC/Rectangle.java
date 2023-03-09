/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHHOC;

/**
 *
 * @author Ngoc Nhi
 */
public class Rectangle extends Shape {
    
    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    double width =1.0d;
    double length =1.0d;
 
    public Rectangle(){
    width= 0;
    length= 0;
    }
    public Rectangle(double width,double length){
    this.width=width;
    this.length=length;
    }
    public Rectangle(double width,double length,String color, boolean filled){
    this.width=width;
    this.length=length;
    this.color=color;
    this.filled=filled;
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
    double getArea(){
    return length*width;
    }
    double getPerimeter(){
    return (length+width)*2;
    }
    public String toString() {
        return "Dien tich "+getArea();
    }
    
}

