package com.company;

public class EasyLane extends Lane implements Printable {
    public int easyCreeps = 2;

    public EasyLane(String complexity) {
        super(complexity);
    }

    @Override
    public void print() {
        System.out.println("♙♙");

    }
}
