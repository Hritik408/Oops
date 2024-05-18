package Intro;

public class wrapperExample {
    public static void main(String[] args) {
        // Integer a = 10;
        // Integer b = 20;
        
        // swap(a, b);
        // System.out.println(a + " " + b);
        // // Integer num = 43;
        // // System.out.println(num);

        
       final A kunal = new A("yadav");
       kunal.name = "other name";   // it is valid
       // when a non-primitive is final then you can not reassign it
        // kunal = new A("new object");  // it is not valid

        A obj;
        for(int i = 0; i < 100000; i++){
            obj = new A("random name");
        }
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    class A {
        final int num = 10;
        String name;
        
        public A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("Object is destroyed");
        }
    }
}
