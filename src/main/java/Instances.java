public class Instances {
    /*
    *
    * i1 == i2 // Check references point to same String
    * i1.equals(i2) // Check the content is same or not
    *
    * */
    public static void main(String[] args) {
//       createInstances();
        stringConcat();
        switchCase("Asitha");

        for(int i=0, j= 10; i<5 || j>1; i++, j--){
            if(i%2==0){
                continue;
            }
            System.out.println(i +" " + j );

        }
        for (int i=0; i<10; i++);

    }

    static class Dog {

        Dog(String name){
            name="t";
        }
    }

    static void stringConcat(){
        String s= "Asi"
                .concat("  +  Thushi")
                .toUpperCase()
                .replace("+","+++");
//        System.out.println(s);


        String s1 = "0123456789";
//        System.out.println(s1.substring(3));
//        System.out.println(s1.substring(3,10)); // 3-9 all characters
    }

    public static void createInstances(){
        Dog d1 = new Dog("s");
        Dog d2 = new Dog("s");

        System.out.println("d1 == d2 "+ (d1==d2)); // false
        System.out.println("d1.equals(d2) "+ (d1.equals(d2))); // false
//        String i1 = "asitha"; // created in String pool
//        String i2 = "asitha"; // referenced from the String pool

        String i1 = new String("asitha"); // created in String pool
        String i2 = new String("asitha"); // referenced from the String pool


        System.out.println("i1 hashcode - " + i1.hashCode());
        System.out.println("i2 hashcode - " + i2.hashCode());

        System.out.println(i1 == i2); // Check references point to same String
        System.out.println(i1.equals(i2)); // Check the content is same or not
    }

    static void switchCase(String word){

        switch (word){
            case "Asitha":
                System.out.println("I m going to Bangkok");

            case "Thushani":
                System.out.println("I m coming with you!");

            default:
                System.out.println("Not going anywhere");
                break;
        }

    }

}

