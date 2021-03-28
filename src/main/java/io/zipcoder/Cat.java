package io.zipcoder;

public class Cat extends Pet{
    String speak = "meow!";

    public Cat(String name){
        super(name);
    }

    public String speak(){
        return speak;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }

}
