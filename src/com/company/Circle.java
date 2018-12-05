package com.company;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int diametr(int radius){
        return radius * 2;
    }

    @Override
    public double square(){
        return (radius * radius)*3.14;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public String toString(){
        return "Фигура: круг, площадь: " + square() + " ед., диаметр: " + diametr(radius) + " ед., радиус: "
                + radius + " ед., цвет: " + color;
    }
}
