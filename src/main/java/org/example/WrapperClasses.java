package org.example;

public class WrapperClasses {

    public static void main(String[] args){
        tryWrapperClasses();
    }

    public static void tryWrapperClasses(){
        int i2 = Integer.parseInt("34");
        int i3 = Integer.valueOf("34");
        float x = Float.parseFloat("34.5");
        short s1 = 10;
        short s2 = 20;
        short s3 = (short) (s1 + s2);
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1+b2);

        System.out.println(5L == 5.00);

    }
}
