package Collect;

public class StaticInstance {

    static int static_var = 10;//static variable
    int instance_var = 20;//instance variable

    public static void main(String[] args) {

        StaticInstance obj1 = new StaticInstance();
        StaticInstance obj2 = new StaticInstance();
        //change values
        obj1.static_var = 50;
        obj1.instance_var = 30;

        System.out.println("Static Variable (obj1): " + obj1.static_var);
        System.out.println("Static Variable (obj2): " + obj2.static_var);
        System.out.println("Instance Variable (obj1): " + obj1.instance_var);
        System.out.println("Instance Variable (obj2): " + obj2.instance_var);
    }
}
