package com.bharatdodeja.javadesignpatterns.structural.composite;

/**
 * Created by bharat.dodeja on 12/2/2016.
 */

public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
}
