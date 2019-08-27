package com.company;

public class HardLane extends Lane implements Printable {
    public int megaCreeps = 4;
    public HardLane(String complexity) {
        super(complexity);
    }

    @Override
    public void print() {
        System.out.println("♔♔♔♔");

    }
}
