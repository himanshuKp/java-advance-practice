public class StringComparison {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1 == s3);   //true
        System.out.println(s1.equals(s3));  //true

        System.out.println(s1 == s2);   //false
        System.out.println(s1.equals(s2));  //false

        System.out.println(s1 == s4);   //false
        System.out.println(s1.equals(s4));  //true
    }
}
