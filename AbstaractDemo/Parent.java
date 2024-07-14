package AbstaractDemo;
 public abstract class Parent {   // a class that contains one or more abstarct methods should also be 'abstract'
 //   abstract void career(String name);  // all the child class must override these career and partner
  //  abstract void partner(String name, int age);  // here we know that these methods are overridden so we make them abstract
   
    int age;   

     public Parent (int age) {
      this.age = age;
     }

    static void hello(){  // here we create static method in abstract class
      System.out.println("hey!!");
    }

    static void normal() {
      System.out.println("this is normal method");
    }

   abstract void career();
   abstract void partner();
}
