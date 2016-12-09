package com.bharatdodeja.javadesignpatterns.model;

/**
 * Created by bharat.dodeja on 12/1/2016.
 */

public abstract class Computer {

    protected abstract String getRAM();
    protected abstract String getHDD();
    protected abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
