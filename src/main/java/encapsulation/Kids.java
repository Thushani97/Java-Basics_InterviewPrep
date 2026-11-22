package encapsulation;

public class Kids extends Juniors{

    private String name;
    private int age;
    static int no;

    public Kids(String name, int age){
        name=name;
        this.age=age; // "this" uses to get instance variables
        no++;
//        System.out.println(name + " "+ this.name );
    }
    Kids(){
        super();
        no++;
    }

    public static void main(String[] args){

        Kids kid1 = new Kids();
        System.out.println(no);
        Kids kid = new Kids("thush", 29);
        System.out.println(no);

        int age = 200;
        Adult john = new Adult("thush", 29);
        change(john,age);
        System.out.println(john.getName() + " "+ john.getAge() + " "+
                 age);

    }

    public static void change(Adult adult, int age){
        adult.setAge(20);
        age=100;
        adult.setName("asi");
        adult = new Adult("cat",22);
    }

}
