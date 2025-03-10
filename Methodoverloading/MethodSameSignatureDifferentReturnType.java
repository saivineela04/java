package Methodoverloading;

class MethodSameSignatureDifferentReturnType {
    int display(int a) {
        return a + 10;
    }



    public static void main(String[] args) {
        MethodSameSignatureDifferentReturnType obj = new MethodSameSignatureDifferentReturnType();
        System.out.println(obj.display(10)); 
    }
}