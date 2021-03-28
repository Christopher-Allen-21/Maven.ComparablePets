package io.zipcoder;

public class Dog extends Pet{
    String speak = "woof!";

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return speak;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }
}

