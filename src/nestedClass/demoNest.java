package nestedClass;

public class demoNest {
    public static void main(String[] args) {
        NestedClass.StaticInnerClass staticInnerClass= new NestedClass.StaticInnerClass();
        staticInnerClass.welcome();
        System.out.println(staticInnerClass.message);

        //Object of NonStatic inner Class
        NestedClass nestedClass = new NestedClass();
        NestedClass.NonStaticInnerClass innerClass = nestedClass.new NonStaticInnerClass();
        innerClass.welcome();


    }
}
