package src.com.progrank.LembdaAsArgument;

interface Operation {
    public int operate(int x, int y);

}

public class Main {

    public static void showResult(int x, int y, Operation op) {
        System.out.println(op.operate(x, y));
    }

    public static void main(String args[]) {
        // By passing Lembda function as an argument it is possible to define the
        // operations that u want to perform at the time of method calling.
        // For example u can define a method that accepts 2 arguments and then determine
        // whether ou want to achive
        // addition/subtraction or devision with that while method call.
        // In this way u don't need to write different methods for
        // multiplication/division etc..
        showResult(5, 6, (a, b) -> (a * b));
    }
}
