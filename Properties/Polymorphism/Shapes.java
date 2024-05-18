package Properties.Polymorphism;
// run-time polymorphism

public class Shapes {
    void area() {   // if we put final before void then it will not overridden and not use by square, cirlcle, triangle
        System.out.println("I'm in Shapes");
    }
}
