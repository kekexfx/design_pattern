package com.bimface.service;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}
