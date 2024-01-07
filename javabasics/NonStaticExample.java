package javabasics;

public class NonStaticExample {
    //Static method only accepts the static variable but non-static variable accepts static as well as non-static data
    //public void m1() is non-static method and public static void m3() is static method
    //

    static int a= 1; //Global variable
    static int b;
    public void m1(){
        //int a= 1; Local variable and life ends within the method
        int b=10;
        System.out.println(a);
        System.out.println(b);
    }

    public static void m3(){
        String name = "Shubham";
        System.out.println(a);
    }
}
