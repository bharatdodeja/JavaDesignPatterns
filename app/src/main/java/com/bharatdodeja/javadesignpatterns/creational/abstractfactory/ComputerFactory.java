package com.bharatdodeja.javadesignpatterns.creational.abstractfactory;

import com.bharatdodeja.javadesignpatterns.model.Computer;

/**
 * Created by bharat.dodeja on 12/1/2016.
 */

class ComputerFactory {
    static Computer getComputer(ComputerAbstractFactory abstractFactory) {
        return abstractFactory.createComputer();
    }
}
