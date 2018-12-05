package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
		Random random = new Random();
		String[] colors = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый", "черный",
				"серый", "белый", "коричневый", "розовый"};
		int count = random.nextInt(20) + 5;
		Shape[] shapes = new Shape[count];
 		for(int i = 0; i < count; i++){
			Shape shape;
			int type = random.nextInt(4);
			if(type == 0){
				int side = random.nextInt(10) + 1;
				int number_color  = random.nextInt(colors.length);
				String color = colors[number_color];
				shape = new Square(side, color);
				shapes[i] = shape;
			}
			if(type == 1){
				int radius = random.nextInt(10) + 1;
				int number_color  = random.nextInt(colors.length);
				String color = colors[number_color];
				shape = new Circle(radius, color);
				shapes[i] = shape;
			}
			if(type == 2){
				int cathetus_1 = random.nextInt(10) + 1;
				int cathetus_2 = random.nextInt(10) + 1;
				int number_color  = random.nextInt(colors.length);
				String color = colors[number_color];
				shape = new Triangle(cathetus_1, cathetus_2, color);
				shapes[i] = shape;
			}
			if(type == 3){
				int main_side_1 = random.nextInt(10) + 1;
				double angle_1 = Math.toRadians(random.nextInt(89) + 1);
				double angle_2 = Math.toRadians(random.nextInt(89) + 1);
				int height = random.nextInt(10) + 1;
				int number_color  = random.nextInt(colors.length);
				String color = colors[number_color];
				shape = new Trapezium(main_side_1, angle_1, angle_2, height, color);
				shapes[i] = shape;
			}
		}
		for (Shape shape : shapes){
			System.out.println(shape);
		}
    }
}
