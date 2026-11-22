public class ContinueBreak {
    public static void main(String[] args){
        testContinue();
    }

    public static void testContinue(){
        OUTERLOOP:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2){
                    continue OUTERLOOP;
                }
                System.out.println("i " + i + " j "+ j);
            }
        }
    }
}
