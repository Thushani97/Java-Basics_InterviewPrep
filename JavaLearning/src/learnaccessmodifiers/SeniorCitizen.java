package learnaccessmodifiers;


import encapsulation.Adult; // since Adults comes from a different package

public class SeniorCitizen extends Adult {
    SeniorCitizen(String name, int age){
        super(name,age);
    }

    public static void main(String[] args){
        Adult adult = new Adult("thush",28);
        adult.pet =  "kitty";
        adult.getAllStudents();
    }
}
