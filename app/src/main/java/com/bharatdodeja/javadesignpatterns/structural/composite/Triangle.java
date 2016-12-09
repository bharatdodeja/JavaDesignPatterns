package com.bharatdodeja.javadesignpatterns.structural.composite;

/**
 * Created by bharat.dodeja on 12/2/2016.
 */

/** Composite Design Pattern Leaf Objects:
    Composite design pattern leaf implements base component and these are the building block for
    the composite. We can create multiple leaf objects such as Triangle, Circle etc.
*/
public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
}
