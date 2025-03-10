package Static;
public class PrintStaticInInstance {
    static int staticVar1 = 100;
    static String staticVar2 = "Static Data";

    void instanceMethod() {
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
    }

    public static void main(String[] args) {
        PrintStaticInInstance obj = new PrintStaticInInstance();
        obj.instanceMethod();
    }
}