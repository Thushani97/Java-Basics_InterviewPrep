package inheritance;


class Animal{
    public void eat(){
        System.out.println("Animal eating");
    }
    public void eat(String name){
        System.out.println(name+ " eating");
    }
    Animal(){};
}

class Horse extends Animal{
    Horse(){
//        super();
    };
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    Horse(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void eat(){
        System.out.println("Horse eating");
    }
    public void buck(){
        System.out.println("Horse buck");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Horse){
            Horse horse = (Horse) obj; // safe to downcast since obj is an instance of Horse
            if(horse.getName()==this.getName() & horse.getAge()== this.getAge()){
                return true;
            }
        }
        return false;
    }

//    @Override
//    public int hashCode(){
//        return 7;
//    }
}

class Dog extends Horse{

    Horse horse = new Horse();

    private float price ;
    public Dog(String name, int age){
        super(name,age);
    }
    public Dog(String name, int age, float price){
        super(name,age); // this has to be in the first line
        this.price = price;
    }
}
public class TestAnimals {
    public static void main(String[] args){
//        Animal ah = new Horse();
//        ah.eat();
//        ah.eat("dog");
//        ah.buck();

        Horse h1 = new Horse("A",2);
        Horse h2 = new Horse("A",2);

        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));

    }



}


class Test1{
    Test1(String t){};
    Test1( int i){};
}

class Test2 extends Test1{

    Test2(int s, String ss){
//        super(s);
        super(ss);
    }
}