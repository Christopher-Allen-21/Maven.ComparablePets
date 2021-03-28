package io.zipcoder;

public class Fish extends Pet{
    String speak = "blub";

    public Fish(String name){
        super(name);
    }

    public String speak(){
        return speak;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }
}
