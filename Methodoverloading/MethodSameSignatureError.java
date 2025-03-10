package Methodoverloading;

class MethodSameSignatureError {
    void display(int a) {
        System.out.println("First Method: " + a);
    }

    public static void main(String[] args) {
        MethodSameSignatureError obj = new MethodSameSignatureError();
        obj.display(10); 
    }
}
