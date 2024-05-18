package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //  Shapes shape = new Shapes();
        //  shape.area();
         Shapes cir = new Circle();
         cir.area();

         Triangel tri = (Triangel) new Shapes();  // here we do type cast Shapes to Triangel
         tri.area();
    
    }
}
