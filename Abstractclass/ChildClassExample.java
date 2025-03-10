package Abstractclass;
    class ChildClassExample extends AbstractClassExample {
        void abstractMethod() {
            System.out.println("Abstract method implemented");
        }
    
        public static void main(String[] args) {
            ChildClassExample child = new ChildClassExample();
            child.nonAbstractMethod();
        }
    }
    
