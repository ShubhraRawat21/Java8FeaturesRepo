package src.com.progrank.java8;

public class Main {

    public static void main(String args[]) {
        /*
         * //*****Anonymous class implementation
         *****/
        // 1.
        // This is the implementation of anonymous class
        // create obj and there itself define the method of anonymous class
        // Syntax Anonymous obj = new Anonymous() {}; "semicoln is imp otherwise
        // compilation error"
        // Anonymous obj = new Anonymous() {
        // public void show() {
        // System.out.println("Hello Anonymous");
        // }
        // };
        // obj.show();
        // */

        // *****Lembda expression implementation *****
        // u can achieve lemba expression only on functional interface
        // functional interface - interface having only one method
        // syntax- Anonymous obj = () -> {};
        // Anonymous obj1 = () -> {
        // System.out.println("Hello Anonymous!!");
        // };
        // obj1.show();
        // }
        // 2.
        Anonymous a = new AnonymousChild();
        a.show();
        Anonymous.add(2, 4);
        a.print();

    }

}
