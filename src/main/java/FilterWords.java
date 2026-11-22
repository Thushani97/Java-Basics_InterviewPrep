import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWords {

    public static void main(String[] args){
        int x = 3;
        // Atleast first condition will be checked
        do{
            System.out.println(x);
            x--;
        }while (x>-9);

        List<String> list = Arrays.asList("Asitha", "Nayana","Asa","Amal");
         List<String> result =filterWords(list);
        System.out.println(result);

    }

    public static List<String> filterWords(List<String> list){
         List<String> r = list.stream().filter(s->s.startsWith("A"))
                 .map(String::toUpperCase)// x->x.toUpperCase()
                 .collect(Collectors.toList());
         return r;
    }
}
