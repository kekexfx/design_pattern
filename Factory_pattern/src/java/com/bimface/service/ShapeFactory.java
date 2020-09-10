package com.bimface.service;

import com.bimface.service.Shape;
import com.bimface.service.impl.Circle;
import com.bimface.service.impl.Rectangle;
import com.bimface.service.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
