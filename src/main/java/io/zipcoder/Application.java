package io.zipcoder;


import java.util.ArrayList;

public class Application {
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public Application(){

    }

    public static void main(String[] args){

        Console console1 = new Console();
        Application mainApp = new Application();

        while(true){
            String morePetsQuestion = console1.getStringInput("Do you have any more pets?");
            if(morePetsQuestion.equalsIgnoreCase("no")){
                break;
            }
            String petTypeQuestion = console1.getStringInput("Please enter the type of pet:");
            String petNameQuestion = console1.getStringInput("Please enter the name of your pet:");
            if(petTypeQuestion.equalsIgnoreCase("cat")){
                Cat cat1 = new Cat(petNameQuestion);
                mainApp.addPet(cat1);
            }
            else if(petTypeQuestion.equalsIgnoreCase("dog")){
                Dog dog1 = new Dog(petNameQuestion);
                mainApp.addPet(dog1);
            }
            else{
                Fish fish1 = new Fish(petNameQuestion);
                mainApp.addPet(fish1);
            }
        }

        for(int i=0;i<mainApp.pets.size();i++){
            System.out.println((i+1)+". Pet Type:"+mainApp.pets.get(i).getClass().getSimpleName()+
                    "   Name:"+mainApp.pets.get(i).getName()+"   Sound:"+mainApp.pets.get(i).speak());
        }

    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

}
