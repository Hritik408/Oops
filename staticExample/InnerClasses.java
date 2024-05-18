package staticExample;

// class Test {    // here it can be static, here Test class is not dependent on any other class
//   static String name;

//    public Test(String name) {
//      Test.name = name;
//    }
//   }

public class InnerClasses { // here it can not be static
   static class Test { // here it can be static, if we write static before class then the error gone
                       // inside Test a, if we make it static then it is not depent on the object of
                       // outer class
      String name;

      public Test(String name) {  // constructor
         this.name = name;
      }

      @Override
      public String toString() {
         return name;
      }
   }

   public static void main(String[] args) {
      Test a = new Test("rahul");
      Test b = new Test("kunal");

      System.out.println(a.name);
      System.out.println(b.name);

      System.out.println(a);   // rahul is print because of line 21 to 23

   }
}
