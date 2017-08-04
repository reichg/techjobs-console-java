package Breakout;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

public class Patient {

    private String name;
    private int age;
    public enum Type {
        DOG,
        CAT,
        RAT,
        RACCOON,
        };
        private Type species;

    private ArrayList<String> shots;
    private HashMap<String, String> extraFields;

    public Patient(String name, int age, Type animalType) {
        this.name = name;
        this.age = age;
        this.species = animalType;
        this.shots = new ArrayList<String>();
        this.extraFields = new HashMap<String, String>();

    }

    public void addShot(String shotInfo) {
        this.shots.add(shotInfo);
    }

    public void addField(String fieldName, String fieldValue) {
        this.extraFields.put(fieldName, fieldValue);
    }


    @Override
    public String toString() {
        String myoutput = "";
        myoutput += "Name: " + this.name + "\n";
        myoutput += "Age: " + this.age + "\n";
        myoutput += "Type: " + this.species + "\n";


        for (String info : this.shots) {
            myoutput += "Shot: " + info + "\n";
        }

        for (String key : this.extraFields.keySet()) {
            myoutput += key + ": " + this.extraFields.get(key) + "\n";
        }
        return myoutput;

    }
}

