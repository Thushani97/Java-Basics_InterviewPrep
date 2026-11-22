public class StringBuilderBuffer {

    public static void main(String[] args){
        useStringBuilder();
    }

    static void useStringBuilder(){
        String s ="abc";
        s.concat("efg");
        System.out.println(s);


        StringBuilder sb = new StringBuilder("abc");
        sb.append("efg").reverse().insert(4,"-----");
        System.out.println(sb.substring(4));
        System.out.println(sb.toString());

    }
}
