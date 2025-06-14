package nestedClass;

public class NestedClass {

    static int outerVariable = 18;

    //state nested class
    static class StaticInnerClass {
        String message = "Hello";

        void welcome (){
            System.out.println("Welcome to 2k25");
        }
    }

    // Mon-static inner class
    class  NonStaticInnerClass {
        void welcome (){
            System.out.println("This is static inner class");
        }
    }

    //anonymous inner class
    void welcomeAnonymous (){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello From Anonymous Class");
            }
        };
        runnable.run();
    }

}
