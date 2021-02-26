public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("All the power");
//        System.out.println(sb);
        sb.append("All the power");
//        System.out.println(sb.capacity());

//        System.out.println(sb.reverse());

        StringBuffer sb1 = new StringBuffer();
        sb1.append("abcde");
        sb1.insert(3,"xyz");
        System.out.println(sb1);
    }
}
