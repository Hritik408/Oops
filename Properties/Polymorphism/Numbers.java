package Properties.Polymorphism;
// compile time polymorphism
public class Numbers {
    double sum(int a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2,3);
        obj.sum(1,2.36);
    }
}
