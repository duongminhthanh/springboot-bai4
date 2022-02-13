package com.example.bai4;

public class Girl {
    private String name;
    /*constructor*/

    public Girl(String name) {
        this.name = name;
    }
    /*getter,setter*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl(" + this.name + ")";
    }
}
