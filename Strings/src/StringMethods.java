public class StringMethods {
    public static void main(String[] args) {
        String s = "hello world";

        System.out.println("Length of the string is: "+s.length());
        System.out.println("Index of: "+s.indexOf("o"));

        System.out.println("substring: "+s.substring(0));
        System.out.println("Substring: "+s.substring(0,4));

        String[] strings = s.split(" ");
        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

        String replace = s.replace("o", "l");
        System.out.println(replace);
        String s1 = replace.toUpperCase();
        System.out.println(s1);
        s1.toLowerCase();   //will not replace s1 to lowercase as strings are immutable
        System.out.println(s1);
    }
}
