package io.zipcoder;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class PetTest{

    @Test
    public void constructorTest() {
        //given
        Pet pet = new Pet("animal name");

        //when
        String expected = "animal name";
        String actual = pet.getName();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        Pet pet = new Pet("animal name");

        pet.setName("new name");

        String expected = "new name";
        String actual = pet.getName();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speakTest() {
        Pet pet = new Pet("animal name");

        String expected = "call of the wild";
        String actual = pet.speak();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setSpeakTest() {
        Pet pet = new Pet("animal name");

        pet.setSpeak("aggressive sounds");

        String expected = "aggressive sounds";
        String actual = pet.speak();


        Assert.assertEquals(expected, actual);

    }


}