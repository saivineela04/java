package Static;

public class Instancevariables {
    static int staticVar1 = 5;
    static int staticVar2 = 10;
    int instanceVar1 = 15;
    int instanceVar2 = 20;

    public static void staticMethod() {
        StaticInstanceExample obj = new StaticInstanceExample();
        System.out.println(obj.instanceVar1);
        System.out.println(obj.instanceVar2);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
