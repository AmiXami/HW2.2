package com.company;

public class MidLane extends Lane implements Printable {
    public int normalCreeps = 3;
    public MidLane(String complexity) {
        super(complexity);
    }

    @Override
    public void print() {
        System.out.println("♝♝♝");

    }
}
