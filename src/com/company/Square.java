package com.company;

public class Square extends Shape{
    private int side;

    public Square(int side, String color){
        this.side = side;
        this.color = color;
    }

    @Override
    public double square(){
        return  side * side;
    }

    public int getSide(){
        return side;
    }

    @Override
    public String toString(){
        return "Фигура: квадрат, площадь: " + square() + " кв. ед., длина стороны: " + side + " ед., цвет: " + color;
    }
}
