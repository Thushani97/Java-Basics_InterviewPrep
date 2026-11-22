import encapsulation.Adult;

public class AccessModifiers {
    public static void main(String[] args){
        Adult john = new Adult("Johnnie",29);
        System.out.println(john.getName());

        john.pet = "Sherry"; // since this is a public attribute, we can access it here.
        john.isAgeOk(12);
    }
}
