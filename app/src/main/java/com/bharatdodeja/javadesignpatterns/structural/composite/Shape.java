package com.bharatdodeja.javadesignpatterns.structural.composite;

/**
 * Created by bharat.dodeja on 12/2/2016.
 *
 *  Composite Pattern Base Component:
 *  Composite pattern base component defines the common methods for leaf and composites.
 *  We can create a class Shape with a method draw(String fillColor) to draw the shape with given color.
 */

interface Shape {
    public void draw(String fillColor);
}