package com.bharatdodeja.javadesignpatterns.creational.abstractfactory;

import com.bharatdodeja.javadesignpatterns.model.Computer;
import com.bharatdodeja.javadesignpatterns.model.Server;

/**
 * Created by bharat.dodeja on 12/1/2016.
 */

class ServerFactory implements ComputerAbstractFactory {
    private final String ram;
    private final String hdd;
    private final String cpu;

    ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
