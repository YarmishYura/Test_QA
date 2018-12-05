package com.company;

public class Trapezium extends Shape{
    private double mainSide_1;
    private double mainSide_2;
    private double side_3;
    private double side_4;
    private double angle_1;
    private double angle_2;
    private int height;

    public Trapezium( double mainSide_1, double angle_1, double angle_2, int height, String color){
        this.mainSide_1 = mainSide_1;
        this.angle_1 = angle_1;
        this.angle_2 = angle_2;
        this.height = height;
        this.color = color;
    }

    @Override
    public double square(){
        return ((mainSide_1 + mainSide_2)/2)* height;
    }

    public double getMainSide_1(){
        return mainSide_1;
    }

    public double getMainSide_2(){
        return mainSide_1 + height * ((1.0 / Math.tan(angle_1)) + (1.0 / Math.tan(angle_2)));
    }

    public double getSide_3(){
        return height/Math.sin(angle_1);
    }

    public double getSide_4(){
        return height/Math.sin(angle_2);
    }

    public double getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return "Фигура: трапеция, площадь: " + square() + " кв.ед., основа: " + mainSide_1
                + " кв.ед., основа: " + String.format("%.2f", getMainSide_2()) +  " кв.ед., сторона: " + String.format("%.2f", getSide_3()) + " кв.ед., сторона: "
                + String.format("%.2f", getSide_4())+ " кв.ед., висота: " + height + " ед., цвет: " + color;
    }
}
