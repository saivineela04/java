package Static;
public class StaticInstanceExample {
    static int staticVar1 = 5;
    static int staticVar2 = 10;
    int instanceVar1 = 15;
    int instanceVar2 = 20;

    public static void staticMethod1() {
        System.out.println(staticVar1);
    }

    public static void staticMethod2() {
        System.out.println(staticVar2);
    }

    public void instanceMethod1() {
        System.out.println(instanceVar1);
    }

    public void instanceMethod2() {
        System.out.println(instanceVar2);
    }

    public static void main(String[] args) {
        StaticInstanceExample obj = new StaticInstanceExample();
        
        staticMethod1();
        staticMethod2();
        
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
