package Constructors;
class AccessModifierConstructors {
    private AccessModifierConstructors() {
        System.out.println("Private Constructor");
    }

    public AccessModifierConstructors(int a) {
        System.out.println("Public Constructor: " + a);
    }

    protected AccessModifierConstructors(String b) {
        System.out.println("Protected Constructor: " + b);
    }

    AccessModifierConstructors(double c) {
        System.out.println("Default Constructor: " + c);
    }

    public static void main(String[] args) {

        new AccessModifierConstructors(10);    
        new AccessModifierConstructors("Hello");  
        new AccessModifierConstructors(20.5);  
    
        new AccessModifierConstructors(); 
    }
}
