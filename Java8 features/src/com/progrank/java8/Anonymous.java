package src.com.progrank.java8;
//1.

// creating an interface for anonymous
// public interface Anonymous {
//     void show();
// }

//2.
//Java 8 features default and static methods
public interface Anonymous {
    void show();

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    default void print() {
        System.out.println("sending msg");
    }

}
