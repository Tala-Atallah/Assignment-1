package com.example.assignment1;

public class Frame {
    private String name;
    private int imageID;
    public static final Frame[] frames = {
            new Frame("Go to Questions", R.drawable.child),
            new Frame("More Info", R.drawable.info),

    };

    private Frame(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }

    public String getName(){return name;}
    public int getImageID(){return imageID;}

}
