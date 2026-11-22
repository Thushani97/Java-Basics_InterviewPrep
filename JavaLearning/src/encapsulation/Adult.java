package encapsulation;

public class Adult {
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  String name;
    private  int age;
    public String pet;
    protected String address;

    public Adult(String name, int age){
        if (isAgeOk(age)){
            this.name=name;
            this.age = age;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

      public boolean isAgeOk(int age){
        if(30>age && age>20)
            return true;
         else
             return false;
    }

    public void getAllStudents(){
        System.out.println("From Adults class");
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

