package io.zipcoder;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DogTest{

    @Test
    public void constructorTest() {
        Dog dog = new Dog("balto");

        String expected = "balto";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Dog dog = new Dog("balto");
        dog.setName("airbud");

        String expected = "airbud";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest1() {
        Dog dog = new Dog("airbud");

        String expected = "woof!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void speakTest2() {
        Dog dog = new Dog("wishbone");
        dog.setSpeak("bark");

        String expected = "bark";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}