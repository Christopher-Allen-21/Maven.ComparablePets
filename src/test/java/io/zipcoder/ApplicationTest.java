package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {

    @Test
    public void addPetTest1() {
        Application mainApp = new Application();

        Cat cat = new Cat("burrito");
        Dog dog = new Dog("airbud");
        Fish fish = new Fish("fishy");
        ArrayList<Pet> pets = new ArrayList<Pet>();

        mainApp.addPet(cat);
        mainApp.addPet(dog);
        mainApp.addPet(fish);

        Integer expected = 3;
        Integer actual = mainApp.getPets().size();

        Assert.assertEquals(expected,actual);
    }

    ///////// NOT SURE IF THIS ONE WILL WORK. MORE OF AN EXPERIMENT REALLY ///////////
    @Test
    public void addPetTest2() {
        Application mainApp = new Application();

        Cat cat = new Cat("burrito");
        Dog dog = new Dog("airbud");
        Fish fish = new Fish("fishy");
        ArrayList<Pet> pets = new ArrayList<Pet>();

        mainApp.addPet(cat);
        mainApp.addPet(dog);
        mainApp.addPet(fish);

        String expected = "airbud";
        String actual = mainApp.getPets().get(1).name;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void comparePetTest1() {
        Application mainApp = new Application();

        Cat cat1 = new Cat("burrito");
        Cat cat2 = new Cat("jerry");
        Dog dog1 = new Dog("airbud");
        Fish fish1 = new Fish("fishy");

        mainApp.addPet(cat1);
        mainApp.addPet(cat2);
        mainApp.addPet(dog1);
        mainApp.addPet(fish1);
        Collections.sort(mainApp.getPets());

        String expected1 = "airbud";
        String actual1 = mainApp.getPets().get(0).getName();
        String expected2 = "burrito";
        String actual2 = mainApp.getPets().get(1).getName();
        String expected3 = "fishy";
        String actual3 = mainApp.getPets().get(2).getName();
        String expected4 = "jerry";
        String actual4 = mainApp.getPets().get(3).getName();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected4,actual4);
    }

    @Test
    public void comparePetTest2() {
        Application mainApp = new Application();

        Cat cat1 = new Cat("burrito");
        Cat cat2 = new Cat("jerry");
        Dog dog1 = new Dog("alpha");
        Fish fish1 = new Fish("jerry");

        mainApp.addPet(cat1);
        mainApp.addPet(cat2);
        mainApp.addPet(dog1);
        mainApp.addPet(fish1);
        Collections.sort(mainApp.getPets());

        Pet expected1 = dog1;
        Pet actual1 = mainApp.getPets().get(0);
        Pet expected2 = cat1;
        Pet actual2 = mainApp.getPets().get(1);
        Pet expected3 = cat2;
        Pet actual3 = mainApp.getPets().get(2);
        Pet expected4 = fish1;
        Pet actual4 = mainApp.getPets().get(3);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected4,actual4);
    }

    @Test
    public void comparePetTest3() {
        Application mainApp = new Application();

        Dog dog1 = new Dog("alpha");
        Cat cat1 = new Cat("alpha");
        Fish fish1 = new Fish("alpha");

        mainApp.addPet(cat1);
        mainApp.addPet(dog1);
        mainApp.addPet(fish1);
        Collections.sort(mainApp.getPets());

        Pet expected1 = cat1;
        Pet actual1 = mainApp.getPets().get(0);
        Pet expected2 = dog1;
        Pet actual2 = mainApp.getPets().get(1);
        Pet expected3 = fish1;
        Pet actual3 = mainApp.getPets().get(2);

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }
}
