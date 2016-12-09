package com.bharatdodeja.javadesignpatterns.structural.composite;

/**
 * Created by bharat.dodeja on 12/2/2016.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Composite object:
 * A composite object contains group of leaf objects and we should provide some helper methods
 * to add or delete leafs from the group. We can also provide a method to remove all the elements
 * from the group.
 */
public class Drawing implements Shape {

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for (Shape sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Shape s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}