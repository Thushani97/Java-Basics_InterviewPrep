package streamapi;

import java.util.Arrays;
import java.util.List;

public class BasicStream {
    public static void main(String[] args){
        divideByTwo();
    }

    public static void divideByTwo(){
        List<Integer> numbers = Arrays.asList(1,34,45,64,6);

        List<Integer> result = numbers.stream()
                .filter(x->x%2==0)
                .toList();
        result.stream().forEach(x-> System.out.println(x));
    }
}
