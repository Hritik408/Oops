package Properties.Polymorphism;

public class Circle extends Shapes{
    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override  // this is called annotation, basically when u check whether the method is overridden or not put override above it
    void area () {
        System.out.println("I'm area of circle");
    }
}
