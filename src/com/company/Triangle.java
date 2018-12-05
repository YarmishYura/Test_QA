package com.company;

public class Triangle extends Shape{
    private int cathetus_1;
    private int cathetus_2;

    public Triangle(int cathetus_1, int cathetus_2, String color){
        this.cathetus_1 = cathetus_1;
        this.cathetus_2 = cathetus_2;
        this.color = color;
    }

    @Override
    public double square(){
        return (cathetus_1*cathetus_2)/2;
    }

    public double getCathetus_1(){
        return cathetus_1;
    }

    public double getCathetus_2(){
        return cathetus_2;
    }

    public double getGipotenuz(){
        return Math.sqrt((cathetus_1*cathetus_1)+(cathetus_2*cathetus_2));
    }

    @Override
    public String toString(){
        return "Фигура: треугольник, площадь: " + square() + " кв.ед., гипотенуза: "
                + String.format("%.2f", getGipotenuz()) + " ед., катет: " + cathetus_1 + " ед., катет: " + cathetus_2 + " ед., цвет: " + color;
    }
}
