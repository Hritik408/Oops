package Properties.Inheritance;

public class BoxWeight extends Box{  // here inside BoxWeight we can access all the properties of Box(base class or parent class)
   double weight;

   public BoxWeight() {
    this.weight = 8;
   }

   public BoxWeight (double side, double weight) {  // side is just above the as Box
      super(side);
      this.weight = weight;
   }

   public BoxWeight(double l, double h, double w, double weight) {
    super(l, h, w);   // call the parent class constructor
    this.weight = weight;
   }
    
}  
