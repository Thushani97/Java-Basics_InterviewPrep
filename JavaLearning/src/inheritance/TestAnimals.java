package inheritance;


class Animal{
    public void eat(){
        System.out.println("Animal eating");
    }
    public void eat(String name){
        System.out.println(name+ " eating");
    }
}


class Horse extends Animal{
    @Override
    public void eat(){
        System.out.println("Horse eating");
    }
    public void buck(){
        System.out.println("Horse buck");
    }
}

public class TestAnimals {
    public static void main(String[] args){
        Animal ah = new Horse();


    }}
