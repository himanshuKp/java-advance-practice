package in.himanshu.generics;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        MyGenerics<Integer> ingGeneric = new MyGenerics<>(12);
        ingGeneric.displayObjectDetails();
        System.out.println("Get value: "+ingGeneric.getId());

//        MyGenerics<String> stringMyGenerics = new MyGenerics<>("Himanshu");
//        stringMyGenerics.displayObjectDetails();
//        System.out.println("Get value: "+stringMyGenerics.getId());
    }
}
