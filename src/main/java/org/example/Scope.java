package org.example;

public class Scope {
    static  int count;
    int x;
    {
        x++;
        count=9;
    }
     public static void main(String [] args){
         int a = 1;
         a=2;

         {
             a=3;
             int b=0;
             b++;
             {
                 b++;
                 a++;
             }
         }
     }

}
