public class TernaryOperator {

    public static void main(String[] args){
        int numPets = 23;
        int s = 4;
        String status = (numPets<4) ? "Pet limit not exceeded"
                : (s>30) ? "Good" : "Bad";
        System.out.println(status);
    }
}
