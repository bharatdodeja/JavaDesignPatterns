package com.bharatdodeja.javadesignpatterns.creational.factory;

import com.bharatdodeja.javadesignpatterns.model.Computer;
import com.bharatdodeja.javadesignpatterns.model.PC;
import com.bharatdodeja.javadesignpatterns.model.Server;

/**
 * Created by bharat.dodeja on 12/1/2016.
 */

class ComputerFactory {

    static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
