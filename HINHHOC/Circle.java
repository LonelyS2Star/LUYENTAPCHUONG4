/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HINHHOC;
    
/**
 *
 * @author Ngoc Nhi
 */
public class Circle extends Shape {
    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    public double radius;
   
    final float Pi = 3.14f;
    
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean filled) {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return Pi*radius*radius;
    }
    double getPerimeter(){
        return 2*Pi*radius;
    }
    @Override
    public String toString() {
        return "Dien tich "+getArea();
    }
    

}
