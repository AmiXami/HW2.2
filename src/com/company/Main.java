package com.company;

public class Main {

    public static void main(String[] args) {
        Lane[] lanes = {new EasyLane("Easy creeps"),
                new MidLane("Normal creeps"), new HardLane("Hard creeps")};
        for (int i = 0; i <lanes.length ; i++) {
            System.out.println(lanes[i].getComplexity());
            ((Printable)lanes[i]).print();
        }
        System.out.println("----------------------------");
        Lane lane1 = createObject("Easy");
        System.out.println(lane1.getComplexity());
        ((Printable)lane1).print();
        Lane lane2 = createObject("Normal");
        System.out.println(lane2.getComplexity());
        ((Printable)lane2).print();
        Lane lane3 = createObject("Hard");
        System.out.println(lane3.getComplexity());
        ((Printable)lane3).print();
    }

    public static Lane createObject(String className){
        switch (className){
            case "Easy":return new EasyLane("Easy creeps");
            case "Normal":return new MidLane("Normal creeps");
            case "Hard":return new HardLane("Hard creeps");
            default:return new Lane("Main lane");
        }
    }

        }




