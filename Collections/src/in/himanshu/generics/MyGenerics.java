package in.himanshu.generics;

public class MyGenerics<T extends Integer> {
    T id;

    public MyGenerics(T id) {
        this.id = id;
    }

    public void displayObjectDetails(){
        System.out.println("The type of object: "+id.getClass().getName());
    }

    public T getId() {
        return id;
    }
}
