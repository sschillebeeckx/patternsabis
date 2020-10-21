package be.abis.exercise.test;

import be.abis.exercise.model.Circle;
import be.abis.exercise.model.Rectangle;
import be.abis.exercise.model.Shape;
import be.abis.exercise.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Shape r = new Rectangle(2,3);
        r.setColor("red");
        Circle c = new Circle("blue",4);

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(r);
        shapes.add(c);
        shapes.add(new Triangle("green",3,6));

     /*   for (Shape s : shapes){
            System.out.println(s);
        } */

        shapes.forEach(System.out::println);

    }




}
