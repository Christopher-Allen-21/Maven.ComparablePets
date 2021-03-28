package io.zipcoder;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FishTest{

    @Test
    public void constructorTest() {
        Fish fish = new Fish("goldie");

        String expected = "goldie";
        String actual = fish.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Fish fish = new Fish("goldie");
        fish.setName("fish");

        String expected = "fish";
        String actual = fish.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest1() {
        Fish fish = new Fish("fish");

        String expected = "blub";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest2() {
        Fish fish = new Fish("fish");
        fish.setSpeak("blub blub");

        String expected = "blub blub";
        String actual = fish.speak();

        Assert.assertEquals(expected, actual);
    }

}