package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable<Pet>,Comparator<Pet> {
    String name;
    String speak = "call of the wild";

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int compareTo(Pet o) {
        int result = this.getName().compareTo(o.getName());
        if(result==0){
            return 0;
        }
        else if(result>0){
            return 1;
        }
        else{
            return -1;
        }
    }

    public int compare(Pet o1, Pet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
